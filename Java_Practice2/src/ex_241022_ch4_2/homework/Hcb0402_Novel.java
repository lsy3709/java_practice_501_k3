package ex_241022_ch4_2.homework;

public final class Hcb0402_Novel extends Hcb0402_Movie {
	//property
	String award;
	int page;
	
	//constructor
	Hcb0402_Novel(String name, String author, int release, String[] character, String award, int page){
		this.name = name;
		this.author = author;
		this.release = release;
		this.character = character;
		this.award = award;
		this.page = page;
	}
	Hcb0402_Novel(){
		this.name = tbd;
		this.author = tbd;
		this.release = 0000;
		this.character = tbdArray;
		this.award = tbd;
		this.page = 000;
	}
	
	//method overriding
	public void introduce() {
		System.out.println("이 책의 제목은 " + name + "입니다");
		System.out.println("이 책의 작가는 " + author + "입니다");
		System.out.println("이 책의 발매일은 " + release + "입니다");
		System.out.println("이 책의 등장인물은");
		for(String c:character) {
			if(c == character[character.length-1]) {
				System.out.println(c + "입니다");
			} else if (c == character[0]) {
				System.out.print("이 영화의 등장인물은 " + c + ", ");
			}
			else {
				System.out.print(c + ", ");
			}
		}
		System.out.println("입니다");
		System.out.println("이 책은 " + award + " 을 수상 했습니다");
		System.out.println("이 책은 " + page + "페이지 분량입니다");
	}
}