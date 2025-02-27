public class 873longestfibnocciserieslength {
        public int lenLongestFibSubseq(int[] arr) {
            if(arr.length<=2){return(0);}
            int n=arr.length;
            HashMap<Integer,Integer> indexmap=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                indexmap.put(arr[i],i);
            }
            int maxi=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    int prev=arr[j];
                    int prevv=arr[i];
                    int len=2;
                    while(indexmap.containsKey(prev+prevv))
                    {
                        len=len+1;
                        maxi=Math.max(len,maxi);
                        int temp=prev;
                        prev=prev+prevv;
                        prevv=temp;
                    }
                }
            }
            return(maxi>2?maxi:0);
        }
    }