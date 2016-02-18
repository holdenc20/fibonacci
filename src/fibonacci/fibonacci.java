package fibonacci;

public class fibonacci {
public static void main(String[] args) {
	int n=1;
	int p=0;
	System.out.println(0);
	for (int x=0;x<22;x++){
		p=n+p;
		System.out.println(p);
		n=n+p;
		System.out.println(n);
	}
}
}
