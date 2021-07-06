package com.psy.springmyworkspace.promise;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromiseController {

	private PromiseRepository repo;

	@Autowired
	public PromiseController(PromiseRepository repo) {
		this.repo = repo;
	}

	@GetMapping(value = "/promise")
	public List<Promise> getPromiseList() {
		return repo.findAll();
	}

	@PostMapping(value = "/promise")
	public Promise addPromise(@RequestBody Promise promise, HttpServletResponse res) {

		if (promise.getName() == null || promise.getName().equals("")) {
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}

		if (promise.getDate() == null || promise.getDate().equals("")) {
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}

		if (promise.getName() == null || promise.getName().equals("")) {
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}

		promise.setCreatedTime(new Date().getTime());
		return repo.save(promise);
	}

	@GetMapping(value = "/promise/{id}")
	public Promise getPromise(@PathVariable int id, HttpServletResponse res) {

		Optional<Promise> promise = repo.findById(id);
		if (promise.isEmpty()) {
			res.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}

		return promise.get();
	}

	@DeleteMapping(value = "/promise/{id}")
	public boolean removePromise(@PathVariable int id, HttpServletResponse res) {

		Optional<Promise> promise = repo.findById(id);
		if (promise.isEmpty()) {
			res.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return false;
		}

		repo.deleteById(id);
		return true;
	}

	@PutMapping(value = "/promise/{id}")
	public Promise modifyPromise(@PathVariable int id, @RequestBody Promise promise, HttpServletResponse res) {

		Optional<Promise> findedPromise = repo.findById(id);
		if (findedPromise.isEmpty()) {
			res.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}

		if (promise.getDate() == null && promise.getDate().equals("")) {
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}

		if (promise.getPromise() == null && promise.getPromise().equals("")) {
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}

		if (promise.getName() == null && promise.getName().equals("")) {
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}

		Promise toUpdatePromise = findedPromise.get();
		toUpdatePromise.setDate(promise.getDate());
		toUpdatePromise.setPromise(promise.getPromise());
		toUpdatePromise.setName(promise.getName());

		return repo.save(toUpdatePromise);
	}
}
