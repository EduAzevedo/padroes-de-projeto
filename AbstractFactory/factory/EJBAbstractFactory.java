public class EJBAbstractFactory implements ServiceAbstractFactory {

	public UserService getUserService(String name, int id, String type) {

		UserService userService = new UserEJBService();
		switch (type.toLowerCase()) {
			case "save":
				userService.save(name);
				break;

			case "delete":
				userService.delete(id);
				break;
		}
		return null;
	}

	@Override
	public CarService getCarService(String model, String type) {

		CarService carService = new CarEJBService();
		switch (type.toLowerCase()) {
			case "save":
				carService.save(model);
				break;

			case "update":
				carService.update(model);
				break;
		}
		return null;
	}
}
