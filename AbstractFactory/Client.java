public class Client {

	public static void main(String[] args) {
		ServiceAbstractFactory eJBFac = new EJBAbstractFactory();
		ServiceAbstractFactory restFac = new RestAbstractFactory();

		System.out.println("======================================");
		eJBFac.getCarService("Gol Bola", "save");
		eJBFac.getUserService("Eduardo", 55, "save");

		System.out.println();

		restFac.getCarService("Gol Bola", "update");
		restFac.getUserService("Eduardo", 55, "delete");
		System.out.println("======================================");
	}

}
