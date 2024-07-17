import java.util.*;
class p1{
    public static void mergeSort(int[] arr,int start,int mid,int end){
      int left_size=mid -start+1;
      int right_size=end-mid;
      // create array  to store left element
      int[] left=new int[left_size];
      //create array to store right element
      int[] right=new int[right_size];
      for(int i=0;i<left_size;i++){
           left[i]=arr[start+i];
      }
      for(int i=0;i<right_size;i++){
        right[i]=arr[mid+1 +i];
      }
       int i=0;
       int j=0;
       int k=start;
       while(i<left_size && j<right_size){
            if(left[i]<right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }else{
                arr[k]=right[j];
                k++;
                j++;
            }
          }
          while(i<left_size){
            arr[k]=left[i];
            k++;
            i++;
          }
          while(j<right_size){
            arr[k]=right[j];
            k++;
            j++;
          }
    
    }
    public static void divideArray(int[] arr,int start,int end){
        if(start<end){
            //step 1:
            int mid=(start+end)/2;
            //step 2:
            divideArray(arr,start,mid);
            //step 3:
            divideArray(arr,mid+1,end);
            // step 4:
            mergeSort(arr,start,mid,end);
        }
    }
    public static void main(String[] args){
        int[] arr={3,1,2,7,9,6};
        int n=arr.length;
        int start=0;
        int end=n-1;
        divideArray(arr,start,end);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}