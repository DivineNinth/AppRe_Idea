package cards

class Pack {

	Long id;

	String title;
	String field; //field of study/department

	Card headCard;

	static hasMany = [cards: Card, tags: Tag]

	static constraints = {
		title blank: false
	}

	Pack(String t){
		title =t;
		headCard = new Card(title+"'s hc","head card of this pack");
		tags =[];
		cards =[];
		cards.add(headCard);
	}

	Pack(String t, String f){
		title =t;
		field =f;
		headCard = new Card(title+"'s hc","head card of this pack");
		tags =[];
		cards =[];
		cards.add(headCard);
	}

	Void addTag(String s){
		tags.add(new Tag(s));
	}

	Void addCard(){
		cards.add(new Card());
	}

	int numOfTags(){
		int i =0;

		if(tags!=null){
			i = tags.size();
		}

		return i;
	}

	int numOfCards(){
		int i =1;

		if(cards>1){
			i = cards.size();
		}

		return i;
	}

	String changeTitle(String t){
		title = t;
		return title;
	}

	String getTitle(){
		return title;
	}

	String changeField(String f){
		field = f;
		return field;
	}

	String getField(){
		return field;
	}

	def getTags(){
		return tags;
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

	def getCards(){
		return cards;
	}

	String getAllCardsText(){
		String temp = "_";
		int i = 0;
		if(cards!=null){
			for(c in cards){
				if(c.hint!=""&c.partC!=""){
					temp = temp+"1."+c.partA+", 2."+c.partB+", 3."+c.partC+": 4."+c.hint+";";
				}else if(c.hint==""&c.partC!=""){
					temp = temp+"1."+c.partA+", 2."+c.partB+", 3."+c.partC+";";
				}else if(c.hint!=""&c.partC==""){
					temp = temp+"1."+c.partA+", 2."+c.partB+": 4."+c.hint+";";
				}else{
					temp = temp+"1."+c.partA+", 2."+c.partB+";";
				}
			}
		}
		return temp;
	}
	
	String getPackPhrase(){
		String phrase ="Pack=="+title;
		if(field!=""){
			phrase = phrase + "/Field=="+field;
		}
		if(tags!=null){
			phrase = phrase + "/Tags==" + getTagsNames();
		}else{
		phrase = phrase + "/Tags==" + ".no tags.";
		}
	
		phrase = phrase + "/Cards==" + getAllCardsText();
		
		return phrase;
	}

	Pack(String t, String f, String ta){
		title =t;
		field =f;
		headCard = new Card(title+"'s hc","head card of this pack");
		tags =[];
		cards =[];
		cards.add(headCard);

		addTag(ta);
	}


}
