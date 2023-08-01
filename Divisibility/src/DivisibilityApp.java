
public class DivisibilityApp {
	public static void DivisibilityByTwo(int n) {
		for(int i=1;i<100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void DivisibilityByThree(int n) {
		for(int i=1;i<100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
		public static void DivisibilityByFive(int n) {
			for(int i=1;i<100;i++) {
				if(i%5==0) {
					System.out.println(i);
				}
			}
}
		public static void DivisibilityByTwoAndFive(int n) {
			for(int i=1;i<100;i++) {
				if(i%2==0 && i%5==0) {
					System.out.println(i);
				}
			}
		}
		public static void DivisibilityByThreeAndTableFive(int n) {
			for(int i=1;i<100;i++) {
				if(i%3==0 && i%5==0) {
					System.out.println(i);
				}
			}
		}
		public static void PrimeNum(int n) {
			for(int i=2;i<100;i++) {
				if(n%i!=0) {
					System.out.println(i);
				}
			}
		}
		public static void DivisibilityByThreeAndEven(int n) {
			for(int i=1;i<100;i++) {
				if(i%2==0 && i%3==0) {
					System.out.println(i);
				}
			}
		}
		public static void DivisibilityByFiveAndOdd(int n) {
			for(int i=1;i<100;i++) {
				if(i%2!=0 && i%5==0) {
					System.out.println(i);
				}
			}
		}
		public static void EvenPrimeNum(int n) {
			for(int i=1;i<100;i++) {
				if(i%2==0 && n%i!=0) {
					System.out.println(i);
				}
			}
		}
	}
