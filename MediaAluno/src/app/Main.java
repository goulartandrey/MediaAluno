package app;

//import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ArrayList<Aluno>lista = new ArrayList<Aluno>();
		for(int i =1; i<4; i++) {
			Aluno aluno = new Aluno();
			System.out.println("Digite o nome do " + i + "º aluno: ");
			aluno.setNome(sc.nextLine());
			System.out.println("Digite a nota do primeiro trimestre:");
			aluno.setNota1(sc.nextInt());
			System.out.println("Digite a nota do segundo trimestre:");
			aluno.setNota2(sc.nextInt());
			System.out.println("Digite a nota do terceiro trimestre:");
			aluno.setNota3(sc.nextInt());
			System.out.println(aluno.getResultado());
			sc.nextLine();
			//lista.add(aluno);
		}
		
		sc.close();

	}

}
