package practice_2026;

public class practice1_14_inheritance {
	private String name;
	private String breeds;
	private double weight;
	
	practice1_14_inheritance(String name,String breeds,double weight){
		this.name = name;
		this.breeds = breeds;
		this.weight = weight;
		
	}
	
	public void greeting() {
		System.out.println("根には！私の名前は"+this.name+"です");
		System.out.println("種類は"+this.breeds+"です。");
		System.out.println("体重は"+this.weight+"kgです");
	}

}
