import java.util.Scanner;

public class ArraysQuiz {

	public static void main(String[] args) {
		   int[ ] matriz = new int[20];
		   Scanner sc= new Scanner(System.in);
		   System.out.println("ingrese un numero a buscar");
		   int b= sc.nextInt();
		   boolean x=false;
;
for(int i=0;i<matriz.length;i++) {
	
	matriz[i]= (int) Math.round(Math.random()*39+1);
	System.out.print(matriz[i]+" ");

}
		
for(int i=0;i<matriz.length;i++) {
	
	if(b==matriz[i]) {
		x=true;
	System.out.println("\n" + matriz[i]+" si existe en el arreglo ");
	}
}	

while(x==false) {
	   System.out.println("\ningrese un numero a buscar");
	   int c= sc.nextInt();	
	for(int i=0;i<matriz.length;i++) {
		
		if(c==matriz[i]) {
			x=true;
		System.out.println("\n" + matriz[i]+" si existe en el arreglo ");
		}
	}	
}
	}

}
