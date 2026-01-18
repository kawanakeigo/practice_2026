package practice_2026;

public class practice1_13_cupcel2 {
	public static void main(String[] args) {
		practice1_13_cupsel cupsel = new practice1_13_cupsel("Geek","太郎");
		
		System .out.println(cupsel.getLastname());
		System.out.println(cupsel.getFirstname());
		
		cupsel.setFirstname("二郎");
		cupsel.setLastname("Geek");
		
		System.out.println(cupsel.getLastname());
		System.out.println(cupsel.getFirstname());
		
		
	}
	
}
