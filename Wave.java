class Solution {
    public void sortInWave(int arr[]) {
        // code here
        
        for(int i=0;i<=arr.length-2;i=i+2){
                
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            
             

            
        }
            
        }
