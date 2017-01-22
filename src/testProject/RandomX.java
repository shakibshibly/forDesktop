package testProject;

import java.util.Random;

public class RandomX {

	public static void main(String[] args) {

		/** (integer) numOfFloatingNum variable to represent how many floating

		point random number user want to generate**/

		int numOfFloatingNum = 260;

		Random r = new Random();

		System.out.println("------------------------------------------------------------------------------------");

		System.out.println(numOfFloatingNum + " uniformly distributed randomly generated floaing-point numbers: ");

		System.out.println("------------------------------------------------------------------------------------");

		System.out.println();

		// generate a uniformly distributed float random numbers

		float[] floats = new float[numOfFloatingNum];

		for (int i = 0; i < floats.length; i++) {

			floats[i] = r.nextFloat() * 20 - 10;

		}

		for (float f : floats) {

			for (int k = 1; k <= 15; k++) {

				System.out.printf("%-2.6f%-4s", f, " ");

			}

			System.out.println();

		}
	}
}

