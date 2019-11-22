package com.practice.educative.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class SlidingWindow {
    public static int maxTurbulenceSize(int[] A) {

        int N = A.length;
        int anchor = 0;
        int maxTurbulent = 1;
        for(int i=1;i<N; i++){
            int c = Integer.compare(A[i-1],A[i]);
            if(c==0){
                anchor = i;
            }else if(i ==N-1 || ( c * Integer.compare( A[i], A[i+1] ) ) != -1 ){
                maxTurbulent = Integer.max(maxTurbulent, i-anchor+1);
                anchor = i;
            }
        }
        return maxTurbulent;
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int onesSum =0;
        for(int loop= 0 ;loop<grumpy.length;loop++){
            if(grumpy[loop] ==0) onesSum+=customers[loop];
        }
        if(X==0) return onesSum;
        int i;
        int maxSum =onesSum, currentSum= onesSum;
        for (i=0;i<X;i++){
            if(grumpy[i]==1)  currentSum +=customers[i];
        }
        maxSum = Math.max(maxSum,currentSum);

        for(i=1;i<customers.length-1;i++){

            if(grumpy[i-1] == 1) currentSum-=customers[i-1];
            if(grumpy[i+1] == 1) currentSum+=customers[i+1];
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static int minSwaps(int[] data) {
        int k = Arrays.stream(data).filter(n -> n%2 == 1).sum();
        int minSwaps = data.length;
        int loopOnesCount =0;
        int i;
        for( i=0;i<k;i++){
            if(data[i] ==1)
                loopOnesCount++;
        }
        minSwaps = k - loopOnesCount;
        while (i<data.length){
            if(data[i-k] ==1)
                loopOnesCount--;
            if(data[i] ==1)
                loopOnesCount++;
            minSwaps = Math.min(minSwaps, k -loopOnesCount);
            i++;
        }
    return minSwaps;
    }

    public static int numKLenSubstrNoRepeats(String S, int K) {

        HashMap<Character,Integer> prevCharStoreMap = new HashMap<Character, Integer>();
        int numK =0;
        if(K > S.length())
            return 0;
        int i;
        char ch;
        char ik;
        for( i=0;i<=K-1;i++){
             ch = S.charAt(i);
            if(prevCharStoreMap.containsKey(ch)){
                prevCharStoreMap.replace(ch,prevCharStoreMap.get(ch)+1);
            }else {
                prevCharStoreMap.put(ch,1);
            }
        }
        if(prevCharStoreMap.size() ==K)
            numK++;

        while (i<S.length()){
            ch = S.charAt(i);
            if(prevCharStoreMap.containsKey(ch)){
                prevCharStoreMap.replace(ch,prevCharStoreMap.get(ch)+1);
            }else {
                prevCharStoreMap.put(ch,1);
            }
             ik = S.charAt(i-K);
            int sizeCheck = prevCharStoreMap.get(ik);
            if(sizeCheck ==1) {
                prevCharStoreMap.remove(ik);
            }
            else{
                    prevCharStoreMap.replace(ik,prevCharStoreMap.get(ik)-1);
            }
            if(prevCharStoreMap.size() ==K)
                numK++;
            i++;
        }

        return numK;
    }

    public static void main(String[] args) {
        //String string = "havefunonleetcode";
        // System.out.println(numKLenSubstrNoRepeats(string,5));
        //int[] data =  new int[]{1,1,1,1,0,1,0,1,1,1,1,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,0,0,1,0,0,0,1,1,1,1,1,1,0,1,0,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0,0,1,1,0,1,1,1,0,1,0,1,0,0,1,0,1,1,0,0,1,0,0,1,0,1,1,0,0,1,0,0,0,0,0,1,1,1,1,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,0,1,0,1,1,1,0,0,0,0,1,0,0,1,0,0,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0};
        //int[] customers = new int[]{1,0,1,2,1,1,7,5};
        //int[] grumpy = new int[]{0,1,0,1,0,1,0,1};  System.out.println(maxSatisfied(customers,grumpy,3));
        int[] turbulent = new int[]{0,8,45,88,48,68,28,55,17,24};

        System.out.println(maxTurbulenceSize(turbulent));


    }
}
