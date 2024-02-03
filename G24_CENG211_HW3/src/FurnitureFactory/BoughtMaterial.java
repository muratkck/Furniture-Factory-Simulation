package FurnitureFactory;

public class BoughtMaterial {
	public RawMaterial r;
	public int count;
	public static int day;
	BoughtMaterial(int day, RawMaterial r, int count){
		this.r = r;
		this.count = count;
		this.day = day;
	}
}
