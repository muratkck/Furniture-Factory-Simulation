package FurnitureFactory;

import java.util.ArrayList;

import FileIO.FileIO;

public class Manufacturer {
	Vendor allMaterials = new Vendor();
	public ArrayList<BoughtMaterial> bMaterial;
	
	public Manufacturer(String fileName){
		buyMaterials(fileName);
	}
	
	
	void buyMaterials(String fileName) {
		bMaterial = new ArrayList<>();
		FileIO manufacturerMaterials = new FileIO(fileName);
		for (int i = 0; i < manufacturerMaterials.allElements.size(); i++) {
			for (int k = 1; k < manufacturerMaterials.allElements.get(i).length; k+=2) {
				int count = Integer.parseInt(manufacturerMaterials.allElements.get(i)[k+1]);
				for (int m = 0; m < allMaterials.getRawMaterials().size(); m++) {
					if (allMaterials.getRawMaterials().get(m).getCode().equals(manufacturerMaterials.allElements.get(i)[k]) && count > 0) {
						bMaterial.add(new BoughtMaterial(i+1, allMaterials.getRawMaterials().get(m), Integer.parseInt(manufacturerMaterials.allElements.get(i)[k+1])));
						count--;
					}
				}
			}
		}
	}
}
