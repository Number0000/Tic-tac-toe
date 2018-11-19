/**
 * 
 */

/**
 * @author Harry
 *
 */

import java.util.*;
import java.io.*;

public class tictactoe {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// main method for tic tac toe
		// declare size of arraylist for input
		
		int n = 0;
		int nn = 0;
		char input = 'c';
		
		//ArrayList<Integer> result;
		char result[];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello, welcome to TIC TAC TOE");
		System.out.println("Please enter n for nxn.");
		n = scan.nextInt();
		nn = n*n;
		//result = new ArrayList<Integer>(nn);
		result = new char[nn];
		for (int e = 1; e < nn ; e++){
			result[e] = ('c');
		}
		System.out.println(result);
		System.out.println("You have enter a "+ n 
				+ "x" + n + " tic tac toe to play.");
		int here = drawcanvas(n, result);
		for (int i = 1; i <= nn ; i++){
				System.out.println("Enter O or X at location " 
						+ i);
				input = scan.next().charAt(0);
				result[i] = input;
		}
		here = drawcanvas(n, result);
		

	}
	
	public static int drawcanvas (int canvas, char[] result){
		System.out.println(result);
		for(int row = 0; row < canvas*2-1; row++){
			for (int col = 0; col < canvas; col++){
				//System.out.println(col + row);
				// odd row, enter input
				if (row%2 == 0){
					if(col == canvas){
						//last before action
						System.out.print(" "+ result[row] + " ");
					} else if(col <= canvas-1){
						//last action
						System.out.print(" " + result[row] + " |" );
					}	else {
						//other than that
						System.out.print(" " + "X" + " |");
					}
				}
				// even row, just format
				if (row%2 == 1){
					if(col == canvas){
						//last before action
						System.out.print("---");
					} else if(col <= canvas-1){
						//last action
						System.out.print("---|");
					} else {
						//other than that
						System.out.print("---|");
					}
				}
			}
			System.out.println();
		}
		return 0;
	}

}
