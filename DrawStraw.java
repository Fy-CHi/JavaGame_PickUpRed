// import javax.swing.*;
// import java.awt.*;
// import java.io.*;
// import javax.imageio.ImageIO;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
// import java.awt.event.WindowListener;
// import java.awt.event.WindowEvent;
import java.util.Collections;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class DrawStraw extends JPanel{

	/*************************************************************************************************
	result-> the order of the [role1, role2, role3, role4]
	deck-> the shuffle cardList, except specail card
	role1Deck, role2Deck, role3Deck, role4Deck -> the cardList of the role have when the start to play
	*************************************************************************************************/
	private ArrayList<Integer> result;
	private ArrayList<Integer> deck;
	private ArrayList<Integer> role1Deck = new ArrayList<Integer>();
	private ArrayList<Integer> role2Deck = new ArrayList<Integer>();
	private ArrayList<Integer> role3Deck = new ArrayList<Integer>();
	private ArrayList<Integer> role4Deck = new ArrayList<Integer>();
	// private Image backgroundImg;
	private int scaler = 4;

	public DrawStraw(ArrayList<Integer> result, ArrayList<Integer> deck){

        // this.backgroundImg = new ImageIcon("Resource/map.png").getImage();

		this.result = result;
		this.deck = deck;
		// this.role1Deck = role1Deck;
		// this.role2Deck = role2Deck;
		// this.role3Deck = role3Deck;
		// this.role4Deck = role4Deck;
		for(int i = 1; i<5; i++){
			result.add(i);
		}
		Collections.shuffle(result);
		for(int i = 1; i<53; i++){
			deck.add(i);
		}
		Collections.shuffle(deck);
		for(int roleDeck = 0; roleDeck<7; roleDeck++){
			role1Deck.add(deck.get((result.get(0)-1)+4*roleDeck));
			role2Deck.add(deck.get((result.get(1)-1)+4*roleDeck));
			role3Deck.add(deck.get((result.get(2)-1)+4*roleDeck));
			role4Deck.add(deck.get((result.get(3)-1)+4*roleDeck));
		}
		for(int rm = 0; rm<28; rm++){
			deck.remove(0);
		}
		for(int special=53; special<57;special++){
			deck.add(special);
		}
		Collections.shuffle(deck);
		while(true){
			int specialEnd=0;
			for(int cardNum=53; cardNum<57; cardNum++){
				for(int deckIndex=24; deckIndex<27; deckIndex++){
					if(deck.get(deckIndex)==cardNum){
						Collections.shuffle(deck);
						specialEnd++;
						break;
					}
				}
				for(int deckFindex=0; deckFindex<8; deckFindex++){
					if(deck.get(deckFindex)==cardNum){
						Collections.shuffle(deck);
						specialEnd++;
						break;
					}
				}
			}
			if(specialEnd==0){
				break;
			}
		}
	}

	// public void paintComponent(Graphics g){
 //        super.paintComponent(g);
        
 //        int mapX = 0;
 //        int mapY = 0;
 //        g.drawImage(this.backgroundImg,mapX,mapY,this.backgroundImg.getWidth(null)/scaler,this.backgroundImg.getHeight(null)/scaler,null);
        
 //        }
    

	public Integer getRole1Order(){
		return this.result.get(1);
	}

	public Integer getRole2Order(){
		return this.result.get(2);
	}

	public Integer getRole3Order(){
		return this.result.get(3);
	}

	public Integer getRole4Order(){
		return this.result.get(4);
	}

	public ArrayList<Integer> getRole1Deck(){
		return this.role1Deck;
	}

	public ArrayList<Integer> getRole2Deck(){
		return this.role2Deck;
	}

	public ArrayList<Integer> getRole3Deck(){
		return this.role3Deck;
	}

	public ArrayList<Integer> getRole4Deck(){
		return this.role4Deck;
	}

	public ArrayList<Integer> getDeck(){
		return this.deck;
	}
}