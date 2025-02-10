public class inversion {
    
    
    public static int inverse(int arr[],int num){
        int count=0;
        for(int i=0;i<num-1;i++){
    for(int j=i+1;j<num;j++){
    if(arr[j]<arr[i]){
        count++;
    }
    }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a ={30, 45 ,60 ,20 ,25};
        int size = a.length;
        
        System.out.println("The inversion count is "+ inverse(a,size));
   
   }        
       }