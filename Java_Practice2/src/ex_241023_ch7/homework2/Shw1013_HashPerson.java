package ex_241023_ch7.homework2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Shw1013_HashPerson {
	private String name;
	private String phone;
	private String currentTime;

	public Shw1013_HashPerson(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public String getName() {
		return name;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public String getRegistrationDate() {
		return currentTime;
	}

	public void displayInfo() {
		System.out.println("이름: " + name + ", 연락처: " + phone + ", 등록 날짜: " + currentTime);
	}

}
