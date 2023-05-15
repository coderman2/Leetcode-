import java.util.Scanner;
public class oddcount {
    public static int countOddNumbers(int low, int high){
        int count = 0;
        for(int i = low;i<=high;i++){
            if(i % 2 !=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the lowest digit: ");
        int low = scanner.nextInt();
        System.out.println("Enter the highest digit: ");
        int high = scanner.nextInt();
        int result = countOddNumbers(low,high);
        System.out.println("The odd numbers within that range is "+result);
    }

}
