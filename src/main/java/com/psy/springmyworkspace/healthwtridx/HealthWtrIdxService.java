package com.psy.springmyworkspace.healthwtridx;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Service
public class HealthWtrIdxService {

	HealthWtrIdxRepository repo;

	public HealthWtrIdxService(HealthWtrIdxRepository repo) {
		this.repo = repo;
	}

	@Scheduled(fixedRate = 1000 * 60 * 60)

	public void requestHealthWtrIdxData() throws IOException {
		System.out.println("----");
		getHealthWtrIdxData("getAsthmaIdx", "1100000000"); // ����
		getHealthWtrIdxData("getAsthmaIdx", "2600000000"); // �λ�
		getHealthWtrIdxData("getAsthmaIdx", "2700000000"); // �뱸
		getHealthWtrIdxData("getAsthmaIdx", "2800000000"); // ��õ
		getHealthWtrIdxData("getAsthmaIdx", "2900000000"); // ����
		getHealthWtrIdxData("getAsthmaIdx", "3000000000"); // ����
		getHealthWtrIdxData("getAsthmaIdx", "3100000000"); // ���
		getHealthWtrIdxData("getAsthmaIdx", "3600000000"); // ����
		getHealthWtrIdxData("getAsthmaIdx", "4100000000"); // ���
		getHealthWtrIdxData("getAsthmaIdx", "4200000000"); // ����
		getHealthWtrIdxData("getAsthmaIdx", "4300000000"); // ���
		getHealthWtrIdxData("getAsthmaIdx", "4400000000"); // �泲
		getHealthWtrIdxData("getAsthmaIdx", "4500000000"); // ����
		getHealthWtrIdxData("getAsthmaIdx", "4600000000"); // ����
		getHealthWtrIdxData("getAsthmaIdx", "4700000000"); // ���
		getHealthWtrIdxData("getAsthmaIdx", "4800000000"); // �泲
		getHealthWtrIdxData("getAsthmaIdx", "5000000000"); // ����
		// õ��, ����ȯ ���� ����

		getHealthWtrIdxData("getStrokeIdx", "1100000000"); // ����
		getHealthWtrIdxData("getStrokeIdx", "2600000000"); // �λ�
		getHealthWtrIdxData("getStrokeIdx", "2700000000"); // �뱸
		getHealthWtrIdxData("getStrokeIdx", "2800000000"); // ��õ
		getHealthWtrIdxData("getStrokeIdx", "2900000000"); // ����
		getHealthWtrIdxData("getStrokeIdx", "3000000000"); // ����
		getHealthWtrIdxData("getStrokeIdx", "3100000000"); // ���
		getHealthWtrIdxData("getStrokeIdx", "3600000000"); // ����
		getHealthWtrIdxData("getStrokeIdx", "4100000000"); // ���
		getHealthWtrIdxData("getStrokeIdx", "4200000000"); // ����
		getHealthWtrIdxData("getStrokeIdx", "4300000000"); // ���
		getHealthWtrIdxData("getStrokeIdx", "4400000000"); // �泲
		getHealthWtrIdxData("getStrokeIdx", "4500000000"); // ����
		getHealthWtrIdxData("getStrokeIdx", "4600000000"); // ����
		getHealthWtrIdxData("getStrokeIdx", "4700000000"); // ���
		getHealthWtrIdxData("getStrokeIdx", "4800000000"); // �泲
		getHealthWtrIdxData("getStrokeIdx", "5000000000"); // ����
		// ������ ��������

		getHealthWtrIdxData("getFoodPoisoningIdx", "1100000000"); // ����
		getHealthWtrIdxData("getFoodPoisoningIdx", "2600000000"); // �λ�
		getHealthWtrIdxData("getFoodPoisoningIdx", "2700000000"); // �뱸
		getHealthWtrIdxData("getFoodPoisoningIdx", "2800000000"); // ��õ
		getHealthWtrIdxData("getFoodPoisoningIdx", "2900000000"); // ����
		getHealthWtrIdxData("getFoodPoisoningIdx", "3000000000"); // ����
		getHealthWtrIdxData("getFoodPoisoningIdx", "3100000000"); // ���
		getHealthWtrIdxData("getFoodPoisoningIdx", "3600000000"); // ����
		getHealthWtrIdxData("getFoodPoisoningIdx", "4100000000"); // ���
		getHealthWtrIdxData("getFoodPoisoningIdx", "4200000000"); // ����
		getHealthWtrIdxData("getFoodPoisoningIdx", "4300000000"); // ���
		getHealthWtrIdxData("getFoodPoisoningIdx", "4400000000"); // �泲
		getHealthWtrIdxData("getFoodPoisoningIdx", "4500000000"); // ����
		getHealthWtrIdxData("getFoodPoisoningIdx", "4600000000"); // ����
		getHealthWtrIdxData("getFoodPoisoningIdx", "4700000000"); // ���
		getHealthWtrIdxData("getFoodPoisoningIdx", "4800000000"); // �泲
		getHealthWtrIdxData("getFoodPoisoningIdx", "5000000000"); // ����
		// ���ߵ� ���� ����

		getHealthWtrIdxData("getSkinDiseaseIdx", "1100000000"); // ����
		getHealthWtrIdxData("getSkinDiseaseIdx", "2600000000"); // �λ�
		getHealthWtrIdxData("getSkinDiseaseIdx", "2700000000"); // �뱸
		getHealthWtrIdxData("getSkinDiseaseIdx", "2800000000"); // ��õ
		getHealthWtrIdxData("getSkinDiseaseIdx", "2900000000"); // ����
		getHealthWtrIdxData("getSkinDiseaseIdx", "3000000000"); // ����
		getHealthWtrIdxData("getSkinDiseaseIdx", "3100000000"); // ���
		getHealthWtrIdxData("getSkinDiseaseIdx", "3600000000"); // ����
		getHealthWtrIdxData("getSkinDiseaseIdx", "4100000000"); // ���
		getHealthWtrIdxData("getSkinDiseaseIdx", "4200000000"); // ����
		getHealthWtrIdxData("getSkinDiseaseIdx", "4300000000"); // ���
		getHealthWtrIdxData("getSkinDiseaseIdx", "4400000000"); // �泲
		getHealthWtrIdxData("getSkinDiseaseIdx", "4500000000"); // ����
		getHealthWtrIdxData("getSkinDiseaseIdx", "4600000000"); // ����
		getHealthWtrIdxData("getSkinDiseaseIdx", "4700000000"); // ���
		getHealthWtrIdxData("getSkinDiseaseIdx", "4800000000"); // �泲
		getHealthWtrIdxData("getSkinDiseaseIdx", "5000000000"); // ����
		// �Ǻ���ȯ ���� ����

	}

	public void getHealthWtrIdxData(String itemCode, String where) throws IOException {

		String serviceKey = "4xEmD9%2B%2BLp9Fu4gyx39cMubj7O3NgdEvWopZWRJdwXI%2F57PnaYnq5tbbrEnnBcdy9ICFSppjOIKfrDdlbmYXcQ%3D%3D";

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd06");
		Date time = new Date();
		String today = format.format(time);
		System.out.println(today);

		StringBuilder builder = new StringBuilder();
		builder.append("http://apis.data.go.kr/1360000");
		builder.append("/HealthWthrIdxService");
		builder.append("/" + itemCode);
		builder.append("?serviceKey=" + serviceKey);
		builder.append("&numOfRows=10");
		builder.append("&pageNo=1");
		builder.append("&dataType=JSON");
		builder.append("&areaNo=" + where);
		builder.append("&time=" + today);
		System.out.println(builder.toString());

		URL url = new URL(builder.toString());
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		byte[] result = con.getInputStream().readAllBytes();

		String data = new String(result, "UTF-8");
		System.out.println(data);

		HealthWtrIdxResponse response = new Gson().fromJson(data, HealthWtrIdxResponse.class);
		System.out.println(response);

		for (HealthWtrIdxResponse.Item item : response.getResponse().getBody().getItems().getItem()) {
			repo.save(new HealthWtrIdx(item));

		}

	}

}