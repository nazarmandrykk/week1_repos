package $week1;


import java.util.ArrayList;

public class App {

    public static ArrayList<Character> getUniqueCharacters(ArrayList<String> strings) {
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (String str : strings) {
            for (char c : str.toCharArray()) {
                if (!uniqueChars.contains(c)) {
                    uniqueChars.add(c);
                }
            }
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("thisIsString1");
        strings.add("thisString2");


        ArrayList<Character> uniqueChars = getUniqueCharacters(strings);
        for (char c : uniqueChars) {
            System.out.println(c);
        }
    }
}