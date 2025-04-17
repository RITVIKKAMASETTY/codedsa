import java.util.*;
public class activityselection {
public static void main(String args[])
{
int start[]={1,3,0,5,8,5};
int end[]={2,4,6,7,9,9};
int activites[][]=new int[start.length][3];
for(int i=0;i<start.length;i++)
{activites[i][0]=i;
activites[i][1]=start[i];
activites[i][2]=end[i];
}Arrays.sort(activites,Comparator.comparingDouble(o->o[2]));
int maxact=1;
ArrayList<Integer> ans=new ArrayList<>();
ans.add(activites[0][0]);
maxact=1;
int lastend=activites[0][2];
for(int i=1;i<activites.length;i++)
{
if(lastend<=activites[i][1])
{
ans.add(activites[i][0]);
maxact=maxact+1;lastend=activites[i][2];
}
}
System.out.println(maxact);
for(int i=0;i<ans.size();i++){System.out.println("A"+ans.get(i)+" ");}
}
}
/*step 1 sort the array accoring to the end time of the each activity
 * step 2  add the first activity
 * step 3 add the next activity if the start time of that activity is more tan the end time of the previous activity
 * step 4 count=count+1
 */