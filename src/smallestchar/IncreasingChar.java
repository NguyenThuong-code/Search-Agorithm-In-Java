package smallestchar;

import java.util.LinkedList;

public class IncreasingChar {
    public static void main(String[] args) {
        String character = "demonstrate working";
        String[] splitChar = character.split("");
       char min= character.charAt(0);
        LinkedList<Character> max= new LinkedList<>();
        for(int i =0; i< character.length();i++){
//            if(min<character.charAt(i)){
//            }
            LinkedList<Character> list= new LinkedList<>();
            list.add(character.charAt(i));
            for (int j=i+1; j<character.length();j++){
                if(character.charAt(j)>list.getLast()){
                list.add(character.charAt(j));
                }
        }
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch:max
             ) {
            System.out.println(ch);
        }
        System.out.println();
    }
}
