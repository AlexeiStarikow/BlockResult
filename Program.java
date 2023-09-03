 
public class Program {
    public static void main(String[] args) {
        String[] arr = {"123", "23", "hello", "world", "res"};
        
        int count = 0;
        for (String str : arr) {
            if (str.length() <= 3) {
                count++;
            }
        }
        
        String[] newArr = new String[count];
        int index = 0;
        for (String str : arr) {
            if (str.length() <= 3) {
                newArr[index] = str;
                index++;
            }
        }
        
        System.out.println("Short strings:");
        for (String str : newArr) {
            System.out.println(str);
        }
    }
}