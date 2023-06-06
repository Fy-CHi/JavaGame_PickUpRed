import java.util.ArrayList;

public class Role {
	int rid;
	int score;
	ArrayList<Integer> cardList=new ArrayList<Integer>();
	Role(int rid, int score, ArrayList<Integer> cardList){
		this.rid = rid;
		this.score = score;
		this.cardList = cardList;
	}
}
