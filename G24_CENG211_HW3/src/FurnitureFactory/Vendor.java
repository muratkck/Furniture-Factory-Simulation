package FurnitureFactory;

import java.util.ArrayList;

import FileIO.FileIO;

public class Vendor {
	private static ArrayList<RawMaterial> rawMaterials;

	public Vendor() {
		produceMaterials("VendorPossessions.csv");
	}

	void produceMaterials(String fileName){
		FileIO vendorPossesions = new FileIO(fileName);
		rawMaterials = new ArrayList<RawMaterial>();
		for (String[] elem : vendorPossesions.allElements) {
			if (elem[0].contains("PL")) {
				rawMaterials.add(new Plank(elem[0], Integer.parseInt(elem[1]), PlankEnum.valueOf(elem[0]).length, PlankEnum.valueOf(elem[0]).width, 
						PlankEnum.valueOf(elem[0]).height, PlankEnum.valueOf(elem[0]).cost));
			}
			else if (elem[0].contains("WB")) {
				rawMaterials.add(new WoodenBoard(elem[0], Integer.parseInt(elem[1]), WBoardEnum.valueOf(elem[0]).length, WBoardEnum.valueOf(elem[0]).width, 
						WBoardEnum.valueOf(elem[0]).height, WBoardEnum.valueOf(elem[0]).cost));
			}
			else if (elem[0].contains("WP")) {
				rawMaterials.add(new WoodenPlank(elem[0], Integer.parseInt(elem[1]), WPlankEnum.valueOf(elem[0]).length, WPlankEnum.valueOf(elem[0]).width, 
						WPlankEnum.valueOf(elem[0]).height, WPlankEnum.valueOf(elem[0]).cost));
			}
			else if (elem[0].contains("HD")) {
				rawMaterials.add(new Handle(elem[0], Integer.parseInt(elem[1]), HandleEnum.valueOf(elem[0]).length, HandleEnum.valueOf(elem[0]).width, 
						HandleEnum.valueOf(elem[0]).height, HandleEnum.valueOf(elem[0]).cost));
			}
		}
		
	}
	public static ArrayList<RawMaterial> getRawMaterials() {
		return rawMaterials;
	}
}