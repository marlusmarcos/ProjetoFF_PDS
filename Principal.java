import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Principal  {
	static List<Squad> tabela = new ArrayList();
	
	static Hashtable<Integer, Integer> base2 = new Hashtable<Integer, Integer>(); 
	
	
	public static void addtime (String nome,  int pontos) {
		Squad s = new Squad();
		s.setName_squad(nome);
		s.setPontuacao(pontos);
		tabela.add(s);
	}
	public static void addpontos (int pont, int n_abates, int index) {
		tabela.get(index).atualizar(pont, n_abates);
	}
	public static void mostrarTabela () {
		
		int i = 1;
		for (Squad g : tabela) {
			System.out.println (i+"º "+ g.getName_squad() + " - - - - - - - - - - - - - - - Pontos:" + g.getPontuacao());
			i++;
		}
	}/
	
	
	
	
	public static void main (String [] args)  {
	
		
		Principal p = new Principal();
		int a1; //valor que vai ser recebido atraves da chave
		int a2 = 0; //número de abates
		String let = null;
		int opc = 0;
		while (opc != 12) 
    {	
			System.out.println("0  para adicionar times e 1 atualizar a tabela, e 2 para ver a tabela e 9 para sair");
			Scanner ler = new Scanner(System.in);
			int entrada = 0;
			entrada = ler.nextInt();
			int i = 0;
			if (entrada == 0) 
      {
				while(i<12) 
        {
					//int abates;
					int points;
					String nameOfSquad;
					System.out.println("nome do squad e pontuação, respectivamente!");
					Scanner ler2 = new Scanner(System.in);
					nameOfSquad = ler2.nextLine();
					abates 
					points = ler2.nextInt();
					i++;
					addtime (nameOfSquad,abates,points);
				}
			}
			if (entrada == 1) 
      {
				base2.put(1, 20);
				base2.put(2, 17);
				base2.put(3, 15);
				base2.put(4, 13);
				base2.put(5, 12);
				base2.put(6, 10);
				base2.put(7, 8);
				base2.put(8, 7);
				base2.put(9, 5);
				base2.put(10, 2);	
			}
	 }

}
