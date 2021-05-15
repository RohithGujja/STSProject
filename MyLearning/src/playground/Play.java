package playground;


public class Play {
	public static void main(String[] args) {
		String S = "aaaa";
		int[] a = new int[] {3,4,5,6};
		System.out.println(solution(S,a));
	}
	
	public static int solution(String S, int[] C) {
        int cost = 0;
        for (int i = 1; i < C.length; i++) {
            if (S.charAt(i) == S.charAt(i-1)) {
            	cost += Math.min(C[i], C[i - 1]);
            }
        }
        return cost;
    }

}
