class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int n, int k)
    {
        long[] ans = new long[n-k+1];
        
        
        
        Queue<Integer> q = new LinkedList<>();
        
        
        for(int i=0;i<k;i++)
        {
            if(A[i]<0)
            {
                q.add(i);
            }
        }
        
        int j =0;
        
        for(int i=k;i<n;i++)
        {
            if(!q.isEmpty())
            {
                ans[j++] = A[q.peek()];
            }
            else{
                ans[j++] = 0;
            }
            while(!q.isEmpty() && q.peek()<=i-k)
            {
                q.poll();
            }
            if(A[i]<0)
            {
                q.offer(i);
            }
        }
        
        if(!q.isEmpty())
        {
            ans[j++] = A[q.peek()];
        }
        
        return ans;
        
    }
}
