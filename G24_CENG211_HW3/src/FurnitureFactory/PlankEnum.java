package FurnitureFactory;

public enum PlankEnum {
	PL011(20, 4, 100, 125), PL012(10, 5, 150, 170), PL013(15, 3, 50, 50);
	
	public final int length, width, height, cost;
	
	PlankEnum(int length, int width, int height, int cost){
		this.length = length;
		this.width = width;
		this.height = height;
		this.cost = cost;
	}
}
