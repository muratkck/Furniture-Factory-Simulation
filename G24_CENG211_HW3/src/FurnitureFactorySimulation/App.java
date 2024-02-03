package FurnitureFactorySimulation;

import FurnitureFactory.Manufacturer;
import FurnitureFactory.Vendor;

public class App {

	public static void main(String[] args) {
		Manufacturer m = new Manufacturer("Manufacturer1Materials.csv");
		System.out.println(m.bMaterial.get(1).r.getQuality());
	}
}