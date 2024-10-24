package ex_241023_ch7.homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Shw1013_MainHashPerson {
	public static void main(String[] args) {
		HashMap<String, Shw1013_HashPerson> personList = new HashMap<String, Shw1013_HashPerson>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n==HashMap===========================================");
			System.out.println("1. 입력 | 2. 출력 | 3. 검색 | 4. 삭제 | 5. 랜덤 | 6. 종료");
			System.out.println("===================================================");
			System.out.print("메뉴를 선택하세요: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("이름을 입력하세요: ");
				String name = scanner.nextLine();
				System.out.print("연락처를 입력하세요: ");
				String phone = scanner.nextLine();
				Shw1013_HashPerson person = new Shw1013_HashPerson(name, phone);
				personList.put(name, person);
				System.out.println("연락처가 등록되었습니다.");
				break;

			case 2:
				if (personList.isEmpty()) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					System.out.println("\n등록된 연락처:");
					for (Shw1013_HashPerson p : personList.values()) {
						p.displayInfo();
					}
				}
				break;

			case 3:
				System.out.print("검색할 이름을 입력하세요: ");
				String searchName = scanner.nextLine();
				Shw1013_HashPerson foundPerson = personList.get(searchName);
				if (foundPerson != null) {
					System.out.println("검색된 연락처:");
					foundPerson.displayInfo();
				} else {
					System.out.println("해당 이름의 연락처가 없습니다.");
				}
				break;

			case 4:
				System.out.print("삭제할 이름을 입력하세요: ");
				String deleteName = scanner.nextLine();
				if (personList.remove(deleteName) != null) {
					System.out.println("연락처가 삭제되었습니다.");
				} else {
					System.out.println("해당 이름의 연락처가 없습니다.");
				}
				break;

			case 5:
				randomPick(personList);
				break;

			case 6:
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				return;

			default:
				System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			}
		}
	}

	public static void randomPick(HashMap<String, Shw1013_HashPerson> personList) {
		if (personList.isEmpty()) {
			System.out.println("등록된 연락처가 없습니다.");
		} else {
			Random random = new Random();
			ArrayList<Shw1013_HashPerson> values = new ArrayList<>(personList.values());
			int randomIndex = random.nextInt(values.size());
			Shw1013_HashPerson randomPerson = values.get(randomIndex);
			if (randomPerson != null) {
				System.out.println("랜덤으로 선택된 연락처:");
				randomPerson.displayInfo();
			} else {
				System.out.println("랜덤으로 선택된 연락처가 존재하지 않습니다.");
			}
		}
	}
}
