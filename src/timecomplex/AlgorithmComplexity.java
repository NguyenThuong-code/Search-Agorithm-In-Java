package timecomplex;

public class AlgorithmComplexity {
    public static void main(String[] args) {
        String character = "demonstrate working";
        int[] frequentChar = new int[245];
        for (int i=0; i< character.length();i++){
            int ascii= character.charAt(i);
            frequentChar[ascii]+=1;
        }
        int max=0;
        char typeChar = (char) 245;
        for (int j=0; j<245; j++){
            if (frequentChar[j]>max){
                max=frequentChar[j];
                typeChar=(char) j;
            }
        }
        System.out.println("The most appearing letter is '"+typeChar+"'with a frequency of"+max+"times");
    }
}
