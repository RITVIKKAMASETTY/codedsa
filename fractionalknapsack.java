import java.util.*;
public class fractionalknapsack {
public static void main(String args[])
{
int value[]={60,100,120};int weight[]={10,20,30};int capacity=50;
double ans[][]=new double[value.length][3];
for(int i=0;i<value.length;i++)
{ans[i][0]=value[i];
ans[i][1]=weight[i];
ans[i][2]=(double)value[i]/weight[i];
}Arrays.sort(ans,Comparator.comparingDouble(o->o[2]));
int max=0;
for(int i=value.length-1;i>=0;i--)
{
if(capacity>=ans[i][1])
{capacity=(int)(capacity-ans[i][1]);
max=(int)(max+ans[i][0]);
}else{
if(capacity>0)
{
max=(int)(max+(ans[i][2]*capacity));
break;
}
}
}System.out.println(max);
}
}
/*step1 sort the array according to the ratio=value/weight
 * step2 add the hight value/weight and repove from capicity
 * step3 if the capacity is more than 0 and less than any of the weight the ratio*capacity
 */
