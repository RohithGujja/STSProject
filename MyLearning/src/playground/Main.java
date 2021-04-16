package playground;

import java.util.ArrayList;

class Main {
    public static void main(String[] args){
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=1; i<=1000;i++) list.add(i);
    	list.parallelStream().forEach(Main::doubleit);
    }
    
    static void doubleit(Integer i) {
    	System.out.println(i*2);
    }
}