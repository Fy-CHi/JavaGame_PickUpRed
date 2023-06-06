public class Card {
	int cid;
	String suit;
	int num;
	int point;
	String fileName;
	Card(int cid, String suit, int num, int point, String fileName) {
		this.cid = cid;
		this.suit = suit;
		this.num = num;
		this.point = point;
		this.fileName = fileName;
	}
}