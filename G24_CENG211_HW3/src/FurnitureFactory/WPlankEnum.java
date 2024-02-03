package FurnitureFactory;

public enum WPlankEnum {
	WP401(20, 2, 30, 45), WP402(10, 2, 30, 25), WP403(5, 2, 20, 18), WP404(10, 2, 20, 21);
	
	public final int length, width, height, cost;

	WPlankEnum(int length, int width, int height, int cost) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.cost = cost;
	}
}
