
import java.util.Arrays;
import java.util.Comparator;

public class maximumlengthofchairpairs {
    public static void main(String args[])
    {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainlen=1;
        int chainend=pairs[0][1];
        for(int i=1;i<pairs.length;i++)
        {
            if(pairs[i][0]>chainend)
            {
                chainlen=chainlen+1;
                chainend=pairs[i][1];}}System.out.println(chainlen);}}
                /*step1 sort the 2d array according to the second element
                 * step2 add the first element to the chainlen and the second element to chainend
                 * step3 and the next element start time is greater than last pair end time then increase the count by 1 and update the last pair end time
                 */
