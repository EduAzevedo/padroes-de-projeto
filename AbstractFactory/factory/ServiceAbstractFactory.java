public interface ServiceAbstractFactory {

	UserService getUserService(String name, int id, String type);

	CarService getCarService(String model, String type);

}
