
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int i = 0; 
	
	while (i<101) {
		
		if (i%2==0) {
		System.out.print(i + " ");
			}
		i++;
	
		}
		
System.out.println(" ");
System.out.println(" ");
	i--;

	while (i>=0) {
		
		System.out.print(i + " ");
		i = i-3; 

		}

System.out.println(" ");
System.out.println(" ");	

	for (i=1; i<=100; i += 2) {
		
		System.out.print(i + " ");
		
		}
System.out.println(" ");
System.out.println(" ");
	
	for (i = 0; i <= 100; i++) {
		
		if ((i % 3 == 0) && (i % 5 == 0)) {
			System.out.println("HelloWorld ");
			
		}else if (i % 3 == 0) {
			System.out.println("Hello ");
				
		}else if (i % 5 == 0) {
			System.out.println("World ");
			
		}else {
			System.out.println(i + " ");
		}
		
		}
System.out.println("Done!");
	
	
	}
}
