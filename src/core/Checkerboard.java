package core;

public class Checkerboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCheckerboard(7, 6);
		
	}

	public static void printCheckerboard(int columns, int rows)
	{
		for (int c = 0; c < columns; c++)
		{
			for (int r = 0; r < rows; r++)
			{
				if ((r % 2 == 0) && (c % 2 == 0))
				{
					System.out.print("#");
				}
				if ((r % 2 == 0) && (c % 2 != 0))
				{
					System.out.print(" ");
				}
				if ((r % 2 != 0) && (c % 2 == 0))
				{
					System.out.print(" ");
				}
				if ((r % 2 != 0) && (c % 2 != 0))
				{
					System.out.print("#");
				}
			}
			
			System.out.println("");
		}

		System.out.println("");
	}
}
