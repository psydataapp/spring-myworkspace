package com.psy.springmyworkspace.healthwtridx;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthWtrIdxController {
	private HealthWtrIdxRepository repo;

	public HealthWtrIdxController(HealthWtrIdxRepository repo) {
		this.repo = repo;
	}

	@Cacheable(cacheNames = "health-wtr-idx", key = "0")
	@RequestMapping(value = "/opendata/healthwtridx", method = RequestMethod.GET)
	public List<HealthWtrIdx> getListByDataType() {
		Order[] orders = { new Order(Sort.Direction.DESC, "date"), new Order(Sort.Direction.ASC, "code") };
		return repo.findAll(PageRequest.of(0, 68, Sort.by(orders))).toList();

	}
}