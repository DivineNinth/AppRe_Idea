package cards

class Card {

	
	Long id;
	
	String field; //field of study/department
	String classInfo;
	String description;
	
	String partA;
	String partB;
	String partC;
	String partD;
	String hint;

	static hasMany = [ tags: Tag]
	
	StudyStatus status;	//studied with time
	
	static constraints = {
		partA blank: false
		partB blank: false
	}
	
	Card(String a, String b){
		field ="";
		partA =a;
		partB =b;
		partC ="";
		hint ="";
		
		tags=[];
	}
	
	Void addTag(String s){
		tags.add(new Tag(s));
	}
	
	int numOfTags(){
		return tags.size();
	}
	
	String getTagsNames(){
		String temp = "-";
		if(tags!=null){
			for(t in tags){
				temp = temp+", "+t.name;
			}
		}
		return temp;
	}
	
	def getTags(){
		return tags;
	}
	
	String changeTitle(String t){
		title = t;
		return title;
	}
	
	String getTitle(){
		return title;
	}
	
}
