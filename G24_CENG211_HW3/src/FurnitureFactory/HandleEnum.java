package FurnitureFactory;

public enum HandleEnum {
	HD501(3, 3, 3, 17), HD502(3, 2, 7, 34);
	
	public final int length, width, height, cost;

	HandleEnum(int length, int width, int height, int cost) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.cost = cost;
	}
}
