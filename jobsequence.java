
import java.util.*;

public class jobsequence{
    public static class job{
        int id;
        int deadline;
        int profit;
        public job(int id,int deadline,int profit)
        {
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String args[])
    {int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
    ArrayList<job> jobs=new ArrayList<>();
    for(int i=0;i<jobinfo.length;i++)
    {
        jobs.add(new job(i,jobinfo[i][0],jobinfo[i][1]));
    }
    Collections.sort(jobs,(a,b)->b.profit-a.profit);
    ArrayList<Integer> result=new ArrayList<>();
    int time=0;
    for(int i=0;i<jobs.size();i++)
    {
        if(time<jobs.get(i).deadline)
        {
            result.add(jobs.get(i).id);
            time=time+1;
        }
    }
    System.out.println(time);
    for(int i=0;i<result.size();i++)
    {
        System.out.println(result.get(i));
    }
    }
}
/*step1 convert the 2d array into class
 *step2 if the deadline is more than the time then add the job to result
 */