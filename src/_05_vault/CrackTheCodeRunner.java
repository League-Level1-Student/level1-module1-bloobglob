package _05_vault;

public class CrackTheCodeRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		CodeCracker codeCracker = new CodeCracker();
		int ans = codeCracker.CodeCracker();
		System.out.println(ans);
	}
}
