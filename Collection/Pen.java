package Collection;

import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList<String> pens = new ArrayList<>();
		pens.add("Montex");
		pens.add("Reynolds");
		pens.add("Rorito");
		pens.add("Flair");
		pens.add("Cello");
		pens.add("Grip");
		pens.add("Hero");
		pens.add("Fountain");
		//for (int i = 0; i < pens.size(); i++) {
			//System.out.println(pens.get(i));
		//}
		/*int num=0;
		String max="";
		for(String i:pens) {
			if(num<i.length()) {
				num=i.length();
				max=i;
			}*/
			pens.forEach((i)->{System.out.println(i);});
		
		}
		//System.out.println(max);
	}

//}
