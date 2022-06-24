package Lesson1;

//Bottom-Up = Tabulation

public class Solution2 {
    public int fib(int n){
        if (n <= 1) return n;

        int[] cache = new int[n+1];
        cache[1] = 1;
        cache[2] = 1;

        for (int i = 3; i <= n; i++){
            cache[i] = cache[i-1] + cache[i - 2];
        }
        return cache[n];
    }

}
