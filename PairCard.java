import java.util.*;

public class PairCard implements Runnable{
	
	private ArrayList<Integer> handCard;
	private ArrayList<Integer> deskCard;
	private CardInfo cardInf;
	private RoleInfo roleInf;
	private int handNum;
	private int deskNum;
	private int roleIndex;
	private boolean match = false;
	private int millisecond = 10;

	public PairCard(ArrayList<Integer> handCard, ArrayList<Integer> deskCard, CardInfo cardInf, RoleInfo roleInf, int roleIndex){
		this.handCard = handCard;
		this.deskCard = deskCard;
		this.cardInf = cardInf;
		this.roleInf = roleInf;
		this.roleIndex = roleIndex;
	}
	@Override
	public void run(){

		handNum = handCard.get((handCard.size()-1));
		deskNum = deskCard.get((deskCard.size()-1));
		//spade, and club from 1~9
		if(handNum<10){
			//handNum<10
			if(deskNum==(26+(10-handNum)) || deskNum==(39+(10-handNum))){
				match = true;
				roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
				System.out.println("Correct Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}else{
				match = false;
				System.out.println("Wrong Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}
		}
		//handNum>13 && handNum<23
		else if(handNum>13 && handNum<23){ 
			if(deskNum==(52-(handNum-10)) || deskNum==(39+(10-handNum))){
				match = true;
				roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
				System.out.println("Correct Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}else{
				match = false;
				System.out.println("Wrong Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}
		}
		// else if(handNum>13 && handNum<24){} else if(handNum>39 && handNum<49){}
		//heart, and diamond from 1~9
		else if(handNum>26 && handNum<36){
			//handNum>26 && handNum<36
			if(deskNum==(10-(handNum-26)) || deskNum==(10+(39-handNum))){
				match = true;
				roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
				System.out.println("Correct Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}else{
				match = false;
				System.out.println("Wrong Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}
		}
		//handNum>39 && handNum<49
		else if(handNum>39 && handNum<49){ 
			if(deskNum==(10-(handNum-39)) || deskNum==(10+(52-handNum))){
				match = true;
				roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
				System.out.println("Correct Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}else{
				match = false;
				System.out.println("Wrong Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}

		}
		//spade, club, heart, and diamond is J, Q, and K
		else if(handNum>9 && handNum<14){
			if(deskNum==(handNum+26) || deskNum==(handNum+39)){
				match = true;
				roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
				System.out.println("Correct Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}else{
				match = false;
				System.out.println("Wrong Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}
		}else if(handNum>22 && handNum<27){
			if(deskNum==(handNum+13) || deskNum==(handNum+26)){
				match = true;
				roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
				System.out.println("Correct Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}else{
				match = false;
				System.out.println("Wrong Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}
		}else if(handNum>35 && handNum<40){
			if(deskNum==(handNum-13) || deskNum==(handNum-26)){
				match = true;
				roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
				System.out.println("Correct Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}else{
				match = false;
				System.out.println("Wrong Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}
		}else if(handNum>48 && handNum<53){
			if(deskNum==(handNum-26) || deskNum==(handNum-39)){
				match = true;
				roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
				System.out.println("Correct Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}else{
				match = false;
				System.out.println("Wrong Pair.");
				// System.out.println(roleInf.getScore(roleIndex));
			}
		}
		handCard.clear();
		deskCard.clear();
			
	}

	public void doNothing(int millisecond) {
        try {
    	    Thread.sleep(millisecond);
 	    } catch (InterruptedException e) {
 	    	System.out.println("Unexpected interruption");
 	    	System.exit(0);
 	    }
     }

	public boolean getMatch(){
		return this.match;
	}

	public Integer getHandNum(){
		return this.handNum;
	}

	public Integer getDeskNum(){
		return this.deskNum;
	}
}