package FurnitureFactory;

public enum WBoardEnum {
	WB121(150, 3, 100, 500), WB122(90, 3, 210, 655), WB123(50, 3, 50, 135), WB131(100, 4, 120, 550),
	WB132(80, 4, 160, 680);

	public final int length, width, height, cost;

	WBoardEnum(int length, int width, int height, int cost) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.cost = cost;
	}
}