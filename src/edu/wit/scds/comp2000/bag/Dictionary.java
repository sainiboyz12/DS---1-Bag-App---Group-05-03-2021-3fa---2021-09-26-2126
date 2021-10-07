package edu.wit.scds.comp2000.bag;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

			private ArrayList<String> words = new ArrayList<>();
		
		public void addWord(String word) {
		       this.words.add(word);
		   }

		   public int getSize() {
		       return words.size();
		   }

		   
		   public String toString() {
		       String ans = "";
		       for (int i = 0; i < words.size(); i++) {
		           ans += words.get(i) + " ";
		       }
		       return ans;
		   }

		   
		   public Dictionary(Scanner sc) {
		       while (sc.hasNext()) {
		           String str = sc.nextLine();
		           words.add(str);
		       }
		       

		   }
		}
		
	

	


