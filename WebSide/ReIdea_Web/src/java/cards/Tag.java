package cards;

public class Tag{

	String tagName;
	String group;
	
	public Tag(String s){
		tagName =s;
	}
	
	public Tag(String s, String g){
		tagName =s;
		group =g;
	}
	
	public String name(){
		return tagName;
	}
	
	public String group(){
		return group;
	}
	
}
