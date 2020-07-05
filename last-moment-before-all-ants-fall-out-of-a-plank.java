// https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/
class last-moment-before-all-ants-fall-out-of-a-plank {
    public int getLastMoment(int n, int[] left, int[] right) {
        int res = 0;
        for(int l : left)
            res = Math.max(res, l);
        
        for(int r : right)
            res = Math.max(res, n-r);
        
        return res;
    }
}
