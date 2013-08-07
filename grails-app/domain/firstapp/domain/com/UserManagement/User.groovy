package firstapp.domain.com.UserManagement

class User {
	long userid
	String username
	String password
	static constraints = {
		 username(blank: false) 
	 }
}
