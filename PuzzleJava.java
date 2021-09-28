import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{

    //$$$$$$$$$$$$$$$$$$$ GET 10 RANDOM ROLLS BETWEEN 1-20 $$$$$$$$$$$$$$$$$$$$$$$$$
    public ArrayList<Integer> getTenRolls(){

        ArrayList<Integer> randomNums = new ArrayList<Integer>();
        Random rando = new Random();

        for(int i = 0; i <= 10; i++){
            randomNums.add(rando.nextInt(21));
        }
        return randomNums;
    }

    public String getRandomLetter(){
        Random rando = new Random();
        // ArrayList<Character> randomLetters = new ArrayList<Character>();
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String randLetter = alphabet[rando.nextInt(25)];
        // for(int i = 0; i < alphabet.length; i++){
        //     randomletters.add(rando.nextInt(25));
        // }
        return randLetter;
    }
    public char[] generatePassword(){
        Random rando = new Random();
        char[] chars = new char[8];
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < chars.length; i++){
            chars[i] = (char) letters.charAt(rando.nextInt(26));
        }
        return chars;
    }
}