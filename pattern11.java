
public class Test1 {
    public static void main(String[] args) {

     int n=5;
     int a=0,b=1;
     int c=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                c=a+b;
                a=b;
                b=c;


            }
            System.out.println();
        }


     }


    }


output
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	
