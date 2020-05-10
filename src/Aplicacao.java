import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		Set<Integer> total = new HashSet<>();
		
		Scanner sc = new Scanner (System.in);
		
		int count, codigo;
		
		
		System.out.printf("Quantos estudantes Curso A:");
		count = sc.nextInt();
		
		for(int i = 0; i< count; i++)
		{
			codigo = sc.nextInt();
			cursoA.add(codigo);
		}
		
		System.out.printf("Quantos estudantes Curso B:");
		count = sc.nextInt();
		
		for(int i = 0; i< count; i++)
		{
			codigo = sc.nextInt();
			cursoB.add(codigo);
		}
		
		System.out.printf("Quantos estudantes Curso C:");
		count = sc.nextInt();
		
		for(int i = 0; i< count; i++)
		{
			codigo = sc.nextInt();
			cursoC.add(codigo);
		}
		
		
		total.addAll(cursoA);
		total.addAll(cursoB);
		total.addAll(cursoC);
		
		System.out.println(total.size() -1);
		
		

	}

}
