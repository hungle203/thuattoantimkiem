package optionalBaitap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi: ");
        String s = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(s.charAt(i));
            for (int j = i +1; j < s.length() ; j++) {
                if (s.charAt(j) > list.getLast()) {
                    list.add(s.charAt(j));
                }else {
                    break;
                }
            }
            if (list.size() > max.size()) {
                // nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
                max.clear();
                max.addAll(list);
            }
            list.clear();
         }
        for (Character character: max) {
            System.out.println(character);
        }
        System.out.println();
    }
}
