import java.util.*;
import java.io.*;
public class CardInfo {
	public static Card[] cardValue;
	public static ArrayList<String> strList;
    public CardInfo(){
        this.cardValue = new Card[56];
        this.strList = new ArrayList<String>();
    }
	public static void Load(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));   	
    	String str; 
    	int j=0;
    	while ((str=br.readLine())!=null) {	
    		strList.add(str); 		   
    	}
    	for (int i = 0; i < strList.size(); i++) {
    		String a = strList.get(i);
    		Scanner isScanner = new Scanner(a).useDelimiter(",");
    		// System.out.println("Index: " + i + "--" + strList.get(i));
    		if(j<=55) {
    			cardValue[j]=new Card(i,a,i,i,a);
    			cardValue[j].cid=isScanner.nextInt();
    			cardValue[j].suit=isScanner.next();
    			cardValue[j].num=isScanner.nextInt();
    			cardValue[j].point=isScanner.nextInt();
    			cardValue[j].fileName=isScanner.next(); 			
       			//System.out.println(cardValue[j].cid);
                //System.out.println(cardValue[j].color);
                //System.out.println(cardValue[j].num);
                //System.out.println(cardValue[j].fraction);
                //System.out.println(cardValue[j].fname);
    			j++;		
    		}else if(j>56) {
    			break;
    		}
    	}
    	br.close();
	}
	public int getCid(int index){
       return this.cardValue[index].cid;
    }

    public String getSuit(int index){
        return this.cardValue[index].suit;
    }

    public int getNum(int index){
        return this.cardValue[index].num;
    }

    public int getPoint(int index){
        return this.cardValue[index].point;
    }

    public String getFileName(int index){
        return this.cardValue[index].fileName;
    }
}
