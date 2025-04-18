
import java.util.Arrays;
import java.util.Collections;
public class choclate {
public static void main(String args[])
{
    int n=4,m=6;
    Integer costver[]={2,1,3,1,4};//m-1
    Integer costhor[]={4,1,2};//n-1
    Arrays.sort(costver,Collections.reverseOrder());
    Arrays.sort(costhor,Collections.reverseOrder());
    int h=0,v=0,hp=1,vp=1,cost=0;
    while(h<costhor.length&&v<costver.length)
    {
        if(costhor[h]>costver[v])
        {
            cost+=(costhor[h]*vp);
            h++;
            hp++;
        }
        else
        {
            cost+=(costver[v]*hp);
            v++;
            vp++;
        }
    }
    while(v<costver.length)
    {
        cost+=(costver[v]*hp);
        vp++;
        v++;
    }
    while(h<costhor.length)
    {
        cost+=(costhor[h]*vp);
        hp++;
        h++;
    }
    System.out.println(cost);
}  
}
/*step1 chech if the horizontal or vertical cut costs more
 * step2 if horizontal cut costs more then the cost of the cut*vertical pieces
 * step3 if vertical cut costs more then the cost of the cut*horizontal pieces
 */