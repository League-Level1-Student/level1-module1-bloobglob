package _05_vault;

import java.util.Random;

public class Vault {
	Random random = new Random();
	int secretCode = random.nextInt(1000001);
	public static void main(String[] args) {
	}
boolean tryCode(int code) {
	if(secretCode==code) {
		return true;
	}else {
		return false;
	}
}
}
