import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean correct = bracketsAreCorrect(s);
        System.out.println(correct);
        StackLinkedList cc = new StackLinkedList();
        cc.push('1');
        cc.push('2');
        cc.push('3');
        System.out.println(cc.pop());
        System.out.println(cc.pop());
        System.out.println(cc.pop());
    }
    //пример: {(2+5)*[(2+3)*4]+1}/7
    public static boolean bracketsAreCorrect(String s) {
        int count = 0;
        int plusCount = 0;
        Stack stack = new Stack(10);
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            char c = symbols[i];
            if (c == '(' || c == '{' || c =='['){
                stack.push(c);
                count++;
            }
            if(c == ')' && stack.peek(c) == '(' ){
                plusCount++;
                stack.pop();
            }
            if (c == '}' && stack.peek(c) == '{'){
                plusCount++;
                stack.pop();
            }
            if(c == ']' && stack.peek(c) == '['){
                plusCount++;
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
