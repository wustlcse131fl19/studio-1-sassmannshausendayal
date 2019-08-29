package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");


		boolean isOrdered = ( x > y );
		boolean checkOrder = (y > z);
		boolean test = (checkOrder && isOrdered);
		boolean reverse = ( x < y);
		boolean checkreverse = ( y < z);
		boolean test2 = (reverse && checkreverse);
		boolean finalTest = (test || test2);
		System.out.println (finalTest);
	}

}
