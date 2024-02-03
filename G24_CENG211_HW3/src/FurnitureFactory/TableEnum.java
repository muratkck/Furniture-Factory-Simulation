package FurnitureFactory;

public enum TableEnum {
	TB1401("Obsidian", 0, 0, 2, 0, 1, 0, 1, 4, 3, 6, 0, 0, 3, 0), 
	TB1402("Pearl", 0, 0, 3, 0, 1, 0, 2, 2, 2, 4, 0, 0, 2, 0),
	TB1501("Elegant", 0, 0, 2, 1, 0, 2, 1, 2, 4, 8, 0, 0, 0, 4),
	TB1502("Walnut", 0, 0, 0, 4, 2, 3, 1, 3, 1, 4, 0, 0, 0, 1),
	TB1503("Garden", 0, 0, 2, 2, 0, 4, 2, 0, 0, 0, 2, 4, 0, 2);
	
	String name;
	int wb121, wb122, wb123, wb131, wb132, pl011, pl012, pl013, wp401, wp402, wp403, wp404, hd501, hd502;
	
	TableEnum(String name, int wb121, int wb122, int wb123, int wb131, int wb132, int pl011, int pl012, 
			int pl013, int wp401, int wp402, int wp403, int wp404, int hd501, int hd502){
		this.name = name;
		this.wb121 = wb121;
		this.wb122 = wb122;
		this.wb123 = wb123;
		this.wb131 = wb131;
		this.wb132 = wb132;
		this.pl011 = pl011;
		this.pl012 = pl012;
		this.pl013 = pl013;
		this.wp401= wp401;
		this.wp402= wp402;
		this.wp403= wp403;
		this.wp404= wp404;
		this.hd501= hd501;
		this.hd502= hd502;
		
	}
}
