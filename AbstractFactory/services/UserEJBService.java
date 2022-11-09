public class UserEJBService implements UserService {

	public void save(String name) {
		System.out.println("Saving " + name + " through EJB's interface");
	}

	public boolean delete(Integer id) {
		System.out.println("Removing User #" + id + " through EJB's interface");
		return true;
	}
}
