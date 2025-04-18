
import java.util.Arrays;

public class minimumabsolutedifferencepairs {
public static void main(String args[])
{
    int a[]={1,4,7,8};int b[]={2,3,5,6};
    Arrays.sort(a);Arrays.sort(b);int mindiff=0;
    for(int i=0;i<a.length;i++)
    {
    mindiff=Math.abs(a[i]-b[i]);}System.out.println(mindiff);}}
/*step1 sort both the array
 * step2 find the minimum difference of the both array and add
 * step3 print the minimum difference
*/