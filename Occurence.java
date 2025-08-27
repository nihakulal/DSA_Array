import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
   Scanner sc1=new Scanner(System.in);
        int num;
        int count=0;
        System.out.println("Enter the size of array");
        int n=sc1.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc1.nextInt();

        }
        System.out.println("Enter the number:");
        int n1=sc1.nextInt();


          for(int i=0;i<=n-1;i++){
              if(arr[i]==n1){
                  count++;



              }
          }
        System.out.println("count"+count);
    }
}
