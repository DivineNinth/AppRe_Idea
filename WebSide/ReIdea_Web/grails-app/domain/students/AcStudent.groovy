package students

import cards.*;

class AcStudent {
	
    Long id;
	
	String acId;
	String fName;
	String mI;
	String lName;
	String acEmail;
	
	Integer classification;
	
	static hasMany=[studyPacks: Pack]

	static constraints = {
		acId unique: true, blank: false, nullable: false
		id unique: true, blank: false
		fName blank: false
		acEmail email: true, blank: false, nullable: false
		classification scale: 0..6
	}
	
	AcStudent(String a, String f, String m, String l, String e, String s){
		acId = a;
		fName = f;
		mI = m;
		lName = l;
		acEmail = e;
		
		classification = new Integer(s);
		
		Pack te = new Pack();//tutorial pack?
		
		studyPacks = [];
		studyPacks.add(te);
	}
	
	String getFullName(){
		return fName+" "+mI+" "+lName;
	}
	
	String getStudentInfo(){
		String temp = "";
		temp = temp + getFullName();
		temp = acId+ ":" + temp +"--"+classification;
		retrun temp;
	}
	
	def getPacks(){
		return studyPacks;
	}
	
	int StudyPackSize(){
		return studyPacks.size();
	}
	
		
}
