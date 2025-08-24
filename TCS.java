public class TCS {
    public static void main(String[] args) {
        int n=5;
        int arr[]={2,3,1,2,3};
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    found=true;
                    break;
                    }
                }
            }
        if(!found){
        System.out.println(-1);}

    }}

