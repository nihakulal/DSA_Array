public class ZeoEnd {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int index=0;
        int count=1;
        for(int i=0;i<=arr.length-1;i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
