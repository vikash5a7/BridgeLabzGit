package com.bridegLabz.logicalProgram;

public class ticTac {

	private final static int BOARDSIZE = 3; 
	private enum Status { WIN, DRAW, CONTINUE }; 

	private boolean firstPlayer; 
	private boolean gameOver; 
	private static char[][] board = new char[ BOARDSIZE ][ BOARDSIZE ];
	public static void main(String[] args) {
		printBoard();
	}
	static public void printBoard() 
	{
	  System.out.println( " _______________________ " );

	  for ( int row = 0; row < BOARDSIZE; row++ )
	  {
	     System.out.println( "|       |       |       |" );

	     for ( int column = 0; column < BOARDSIZE; column++ )
	        printSymbol( column, board[ row ][ column ] );

	     System.out.println( "|_______|_______|_______|" );
	  } 
	}
	private static void printSymbol(int column, char c) {
		// TODO Auto-generated method stub
		
	}

}
