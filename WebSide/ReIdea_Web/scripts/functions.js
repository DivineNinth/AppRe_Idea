/**
 * Functions needed for basic website
 */

/*
 * checking inputs for validation purposes
 */
function validation(input){
	var b = false;
	if(input != null || input.size > 0){
		b = true;
	}
	return b
}

/*
 * make sure only one check box is selected in a group
 * inputs-
 * 	either group/array of check boxes or 2 checkox elements
 */
function oneCheck(group){//might be .length
	var g = new array[group.size];
	
	var b = false;
	for(i=0;i<group.size;i++){
		if(i && !b){
			b = true;
		}else if(i && b){
			return false;
		}
	}
	return true;
}

function oneCheck(c1, c2){
	var b2 = true;
	if((c1 && c2)||(!c1 && !c2)){
		b2 = false;
	}
	return b2;
}

/*
 * set visiblity 
 * inputs- 
 * eId- "id" of HTML element
 * vis- boolean for display/hide
 */
function setVisiblity(eId, vis){
	if(vis){
		document.getElementById(eId).style.display = "block";
	}else if(!vis){ //vis = false so no visibility
		document.getElementById(eId).style.display = "none";
	}
}


/*
 * hide error
 */
function hideError(){
	setVisible("error...",false);
}

/*
 * show error
 */
function showError(){
	setVisible("error...",true);
}
