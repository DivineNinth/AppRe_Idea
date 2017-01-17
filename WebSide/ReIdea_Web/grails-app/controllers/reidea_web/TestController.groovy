package reidea_web

class TestController {

	/*
	 * it should show index.gsp
	 */
    def index() { }
	
	/*
	 * Both study and test take in parameters to explain what type of test
	 * 
	 * parameters: type, name/id, ...
	 * 
	 * send to page or service, i dont know yet
	 *
	 * idk if it should be title(){} or title ={}
	 */
	
	def practice() {
		render(view:"practice")
	}
	
	def real() {
		render(view:"test")
	}
	
	
}
