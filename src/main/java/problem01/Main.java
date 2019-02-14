package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		if (number < 10) {
			if (number % 3 == 0) {
				return 1;
			}
		} else {
			if((number / 10) % 3 == 0 && number % 10 ==0) {
				return 1;
			} else if ((number % 10) % 3 == 0 && (number / 10) % 3 == 0) {
				return 2;
			} else if ((number % 10) % 3 == 0 || (number / 10) % 3 == 0) {
				if (number % 10 != 0) {
					return 1;
				}
			} 
		}
		return 0;
	}
}