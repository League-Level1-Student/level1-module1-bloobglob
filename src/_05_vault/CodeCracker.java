package _05_vault;

public class CodeCracker {
	int CodeCracker() {
		Vault vault = new Vault();
		int i = 0;
		int ans = -1;
		while(i<1000001) {
			i++;
			if(vault.tryCode(i)) {
				ans = i;
			}
		}
		return ans;
	}
}
