package samplemaven;

public class Division extends Sum {
	
public void division() {
	int a=super.sum();
	int div=a/10;
	System.out.println("Result is "+div);
	
	
}
	public static void main(String[] args) {
		Division a=new Division();
			a.division();// TODO Auto-generated method stub
              int u=a.sum();
              System.out.println("Sum is "+u);
	}

}
