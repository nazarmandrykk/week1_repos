package $week1;


import java.util.ArrayList;

public class App {

    public static ArrayList<Character> charSearch(ArrayList<String> strings) {
        ArrayList<Character> newchar = new ArrayList<>();
        for (String str : strings) {
            for (char c : str.toCharArray()) {
                if (!newchar.contains(c)) {
                    newchar.add(c);
                }
            }
        }
        return newchar;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("thisIsString1");
        ArrayList<Character> newchar = charSearch(strings);
        for (char c : newchar) {
            System.out.println(c);
        }
    }
}