
public class Activity_5 {

	
	public static void main(String[] args ) {
		MyBook newNovel= new MyBook();
		String title = "My Story";
		newNovel.setTitle(title);
		System.out.println("The title is: " + newNovel.getTitle());
	}
	
}


abstract class Book {
	
	 String title;
	
	 abstract void setTitle(String str);
	
	 String getTitle() {
	
		 return title;
	}
	
}

class MyBook extends Book {
	
	void setTitle(String str) {
		title = str;
	}
	
}