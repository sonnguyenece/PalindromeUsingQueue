import javax.management.StandardEmitterMBean;

public class Main {
    public static void main(String[] args) {
        MyGenericStack<String> myStack = new MyGenericStack();
        MyGenericQueue<String> myQueue = new MyGenericQueue();
        String palindromeTest = "Able was I ere I saw Elba";
//        String palindromeTest ="1";
        String[] tempArr=palindromeTest.toLowerCase().split("");

        for (int i = 0; i < tempArr.length; i++) {
           myStack.push(tempArr[i]);
           myQueue.push(tempArr[i]);
        }
       if (checkPalindrome(myStack,myQueue,tempArr)) System.out.println("This is palindrome!");
       else System.out.println("This is not palindrome!");

    }

    public static boolean checkPalindrome(MyGenericStack myStack,MyGenericQueue myQueue,String [] tempArr){
        for (int i = 0; i < tempArr.length; i++) {
            if (!myStack.pop().equals(myQueue.pop()))return false;
        }
        return true;
    }


}
