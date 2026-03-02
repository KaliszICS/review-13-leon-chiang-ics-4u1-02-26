import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void swap(ArrayList<String> a,int x, int y ) {
		String z=a.get(x);
		String z2=a.get(y);
		a.set(y, z);
		a.set (x, z2);
	}
 
	public static ArrayList<Double> createArrayList(double[] x) {
		ArrayList<Double> y=new ArrayList<Double>();
		for (int i=0; i<x.length; i++) {
			y.add(x[i]);
		}
		return y;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] x, int[] y) {
		HashMap<String, Integer> z=new HashMap<String, Integer>();
		for (int i=0; i<x.length; i++) {
			z.put(x[i], y[i]);
		}
		return z;
	}

	public static void increaseAge(HashMap<String, Integer> x, String y) {
		Integer z=x.get(y);
		z++;
		x.put(y, z);
	}

}
