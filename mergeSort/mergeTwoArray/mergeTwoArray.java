import java.util.*;
class p1{
    public static int[] mergeTwoSortedArray(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        //step 1 create new array
        int[] newArray=new int[n+m];
        //step 2 initialize i,j,k
        int i=0,j=0,k=0;
        //step 3 copy the element in arr1 and arr2
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                newArray[k]=arr1[i];
                k++;
                i++;
            }else{
                newArray[k]=arr2[j];
                k++;
                j++;
            }
        }
        // if extra element in arr1 copy element in newArray
        while(i<n){
            newArray[k]=arr1[i];
                k++;
                i++;
        }
         // if extra element in arr2 copy element in newArray
        while(j<m){
            newArray[k]=arr2[j];
                k++;
                j++;
        }
        return newArray;
    }
    public static void main (String[] args){
        int[] arr1={2,5,7};
        int[] arr2={3,4,8};
        int[] result=mergeTwoSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
}