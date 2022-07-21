import java.util.Arrays;

public class SplitArray
{
public static void main (String [] args)
{
int [] orgArr = {10,11,12,13,14,15};   //Initializing array


int len = orgArr.length;  // array length is stored in len variable

int [] a = new int [(len) / 2] ;  // the total array length is divided by two  

int [] b = new int[len-a.length];  //the orgArr length is substracted with the length of 'a' array and stored in array 'b'

//spliting the first and second half of the array
for(int i = 0; i<len ; i++)
{
if(i<a.length)   //0<4  //1<4 // 2<4 //3<4  //4<4 goes to else block
{
a[i] = orgArr[i];  //In 0 index of 'a' array store the first element of orgArr
}
else {
b[i - a.length] = orgArr[i];  // b[4 - 4 ] = orgArr[4]  //Int oth index of b the element in the 4th index of orgArr is stored
}
}

//displaying array
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(b));


// To find average of array
 int sum1 = 0;
int sum2 = 0;
int mid1 = a.length;
int mid2 =b.length;
 
for(int i = 0 ; i < mid1; i++)
{
sum1 = sum1 + a[i];  // to find the sum of elements in array 'a'
}
int frst_avg = sum1 / a.length;  //dividing the sum of 'a' array and the length of 'a' array
System.out.println("Average of first half of the array : "+frst_avg);

for(int i = 0 ; i < mid2; i++)
{
sum2 = sum2 + b[i];// to find the sum of elements in array 'b'
}
int sec_avg = sum2 / b.length; //dividing the sum of 'b' array and the length of 'b' array
System.out.println("Average of second  half of the array : "+sec_avg);

//to find the middle value
int middle_val = orgArr[len/2];
System.out.println("Middle Value : "+middle_val);
}
}
