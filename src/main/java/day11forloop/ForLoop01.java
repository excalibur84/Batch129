package day11forloop;
public class ForLoop01 {

    public static void main(String[] args) {

        String s = "Tramway";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                break;
                }
            System.out.print(s.charAt(i));
        }

    }

}
