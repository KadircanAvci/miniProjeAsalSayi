package miniProjeAsalSayi;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 13;
		int remainder = number % 2;
		
		//System.out.println(remainder);
		boolean isPrime=true;
		//4
		if(number ==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		//3
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		//1
		for(int i=2;i<number;i++) {
			
			if(number%i ==0) {
				isPrime=false;
			}
			
		}	//2
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
		
		
	}
			
}
	


