import java.util.*;

public class AutoPairCard implements Runnable{
	
	private ArrayList<Integer> playerHandCard;
	private ArrayList<Integer> deskTopCard;
	private CardInfo cardInf;
	private RoleInfo roleInf;
	private int handNum;
	private int deskNum;
	private int roleIndex;
	private int pairNum=0;
	private boolean match = false;
	private int millisecond = 10;

	public AutoPairCard(ArrayList<Integer> playerHandCard, ArrayList<Integer> deskTopCard, CardInfo cardInf, RoleInfo roleInf, int roleIndex){
		this.playerHandCard = playerHandCard; //cardList one
		this.deskTopCard = deskTopCard; //cardList two
		this.cardInf = cardInf;
		this.roleInf = roleInf;
		this.roleIndex = roleIndex;
	}
	@Override
	public void run(){

		for(int ind = 0; ind<playerHandCard.size(); ind++){
			handNum = playerHandCard.get(ind);
			for(int indx = 0; indx<deskTopCard.size(); indx++){
				deskNum = deskTopCard.get(indx);
				//spade, and club from 1~9
				if(handNum<10){
					//handNum<10
					if(deskNum==(26+(10-handNum)) || deskNum==(39+(10-handNum))){
						pairNum++;
						// roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
						System.out.println("There is a Pair: " + cardInf.getSuit(handNum-1) + cardInf.getNum(handNum-1) +", " + cardInf.getSuit(deskNum-1) + cardInf.getNum(deskNum-1));
					}else{
						// System.out.println("No Pair.");
					}
				}
				//handNum>13 && handNum<23
				else if(handNum>13 && handNum<23){ 
					if(deskNum==(52-(handNum-10)) || deskNum==(39+(10-handNum))){
						pairNum++;
						// roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
						System.out.println("There is a Pair: " + cardInf.getSuit(handNum-1) + cardInf.getNum(handNum-1) +", " + cardInf.getSuit(deskNum-1) + cardInf.getNum(deskNum-1));
					}else{
						// System.out.println("No Pair.");
					}
				}
				// else if(handNum>13 && handNum<24){} else if(handNum>39 && handNum<49){}
				//heart, and diamond from 1~9
				else if(handNum>26 && handNum<36){
					//handNum>26 && handNum<36
					if(deskNum==(10-(handNum-26)) || deskNum==(10+(39-handNum))){
						pairNum++;
						// roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
						System.out.println("There is a Pair: " + cardInf.getSuit(handNum-1) + cardInf.getNum(handNum-1) +", " + cardInf.getSuit(deskNum-1) + cardInf.getNum(deskNum-1));
					}else{
						// System.out.println("No Pair.");
					}
				}
				//handNum>39 && handNum<49
				else if(handNum>39 && handNum<49){ 
					if(deskNum==(10-(handNum-39)) || deskNum==(10+(52-handNum))){
						pairNum++;
						// roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
						System.out.println("There is a Pair: " + cardInf.getSuit(handNum-1) + cardInf.getNum(handNum-1) +", " + cardInf.getSuit(deskNum-1) + cardInf.getNum(deskNum-1));
					}else{
						// System.out.println("No Pair.");
					}

				}
				//spade, club, heart, and diamond is J, Q, and K
				else if(handNum>9 && handNum<14){
					if(deskNum==(handNum+26) || deskNum==(handNum+39)){
						pairNum++;
						// roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
						System.out.println("There is a Pair: " + cardInf.getSuit(handNum-1) + cardInf.getNum(handNum-1) +", " + cardInf.getSuit(deskNum-1) + cardInf.getNum(deskNum-1));
					}else{
						// System.out.println("No Pair.");
					}
				}else if(handNum>22 && handNum<27){
					if(deskNum==(handNum+13) || deskNum==(handNum+26)){
						pairNum++;
						// roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
						System.out.println("There is a Pair: " + cardInf.getSuit(handNum-1) + cardInf.getNum(handNum-1) +", " + cardInf.getSuit(deskNum-1) + cardInf.getNum(deskNum-1));
					}else{
						// System.out.println("No Pair.");
					}
				}else if(handNum>35 && handNum<40){
					if(deskNum==(handNum-13) || deskNum==(handNum-26)){
						pairNum++;
						// roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
						System.out.println("There is a Pair: " + cardInf.getSuit(handNum-1) + cardInf.getNum(handNum-1) +", " + cardInf.getSuit(deskNum-1) + cardInf.getNum(deskNum-1));
					}else{
						// System.out.println("No Pair.");
					}
				}else if(handNum>48 && handNum<53){
					if(deskNum==(handNum-26) || deskNum==(handNum-39)){
						pairNum++;
						// roleInf.addScore(roleIndex, cardInf.getPoint(handNum-1) + cardInf.getPoint(deskNum-1));
						System.out.println("There is a Pair: " + cardInf.getSuit(handNum-1) + cardInf.getNum(handNum-1) +", " + cardInf.getSuit(deskNum-1) + cardInf.getNum(deskNum-1));
					}else{
						// System.out.println("No Pair.");
					}
				}
			}
		}
		if(pairNum!=0){
			match = true;
		}else{
			match = false;
		}
	}

	// public void doNothing(int millisecond) {
 //        try {
 //    	    Thread.sleep(millisecond);
 // 	    } catch (InterruptedException e) {
 // 	    	System.out.println("Unexpected interruption");
 // 	    	System.exit(0);
 // 	    }
 //     }

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