import java.util.*;
import java.io.*;
public class RoleInfo {
	private Role[] roleValue = new Role[4];
	// public ArrayList<String> strList = new ArrayList<String>();
    // public RoleInfo(){
    //     this.roleValue = new Role[4];
    //     this.strList = new ArrayList<String>();
    // }
	public RoleInfo(){
		
    	ArrayList<Integer> role1CardList = new ArrayList<Integer>();
    	roleValue[0]=new Role(1,0,role1CardList);
    	ArrayList<Integer> role2CardList = new ArrayList<Integer>();
    	roleValue[1]=new Role(2,0,role1CardList);
    	ArrayList<Integer> role3CardList = new ArrayList<Integer>();
    	roleValue[2]=new Role(3,0,role1CardList);
    	ArrayList<Integer> role4CardList = new ArrayList<Integer>();
    	roleValue[3]=new Role(4,0,role1CardList);
    			
	}

	public int getRole(int roleIndex){
       return this.roleValue[roleIndex].rid;
    }

    public int getScore(int roleIndex){
        return this.roleValue[roleIndex].score;
    }

    public int addScore(int roleIndex, int points){
       this.roleValue[roleIndex].score = this.roleValue[roleIndex].score + points;
       return this.roleValue[roleIndex].score;
    }

    public int minusScore(int roleIndex, int points){
        this.roleValue[roleIndex].score = this.roleValue[roleIndex].score - points;
     	return this.roleValue[roleIndex].score;
    }

    public ArrayList<Integer> getCardList(int roleIndex){
        return this.roleValue[roleIndex].cardList;
    }

    public ArrayList<Integer> setCardList(int roleIndex, int handNum, int deskNum){
        this.roleValue[roleIndex].cardList.add(handNum);
        this.roleValue[roleIndex].cardList.add(deskNum);
        return this.roleValue[roleIndex].cardList;
    }
}
