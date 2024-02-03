package FurnitureFactory;

public abstract class RawMaterial {
	private String code;
	private int quality, length, width, height, cost;
	
	RawMaterial(String code, int quality, int length, int width, int height, int cost){
		this.code = code;
		this.quality = quality;
		this.length = length;
		this.width = width;
		this.height = height;
		this.cost = cost;
	}

	public String getCode() {
		return code;
	}

	public int getQuality() {
		return quality;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getCost() {
		return cost;
	}
	
	
	
}
