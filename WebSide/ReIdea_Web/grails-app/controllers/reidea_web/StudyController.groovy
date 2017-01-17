package reidea_web

class StudyController {

    def index() { 
		render(view:index)
	}

	def studyCards(){
		render(view:study)
	}
	
}
