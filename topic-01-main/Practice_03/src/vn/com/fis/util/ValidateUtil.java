package vn.com.fis.util;

public class ValidateUtil {
	//hàm kiểm tra số nguyên tố
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//hàm kiểm tra số chính phương
	public static boolean isPerfectSquare(int n) {
		int i = (int)Math.sqrt(n);
		return i == (n * n);
	}
	
	//hàm kiểm tra số fibo
	
	public static boolean isFibonacci(int n) {
		return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
	}
	
	//hàm tính số tam giác
	public static int getTriangular(int n) {
		if(n <= 0) return 0;
		else {
			int triang = 0;
			for(int i = 1; i <= n; i++) {
				triang += i;
			}
			return triang;
		}
	}
}
