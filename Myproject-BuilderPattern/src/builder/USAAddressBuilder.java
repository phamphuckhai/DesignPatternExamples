package builder;

public class USAAddressBuilder extends Builder{
	private Address add = new Address();

	@Override
	public void builderCity(String city) {
		add.setCity(city);
	}

	@Override
	public void builderRegion(String region) {
		add.setRegion(region);
	}

	@Override
	public void builderStreet(String street) {
		add.setStreet(street);
	}

	public Address getAddress() {
		return add;
	}
}
