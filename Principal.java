import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Principal  
{
	static List<Squad> tabela = new ArrayList();
	
	static Hashtable<Integer, Integer> base2 = new Hashtable<Integer, Integer>(); 
	
	
	public static void addtime (String nome,  int pontos) 
	{
		Squad s = new Squad();
		s.setName_squad(nome);
		s.setPontuacao(pontos);
		tabela.add(s);
	}
	public static void addpontos (int pont, int n_abates, int index) 
	{
		tabela.get(index).atualizar(pont, n_abates, 2);
	}
	public static void mostrarTabela () 
	{
		
		int i = 1;
		for (Squad g : tabela) 
		{
			System.out.println (i+"º "+ g.getName_squad() + " - - - - - - - - - - - - - - - Pontos:" + g.getPontuacao());
			i++;
		}
	}
	public static void main (String [] args)  
	{
		/*Ainda falta colocar uma tomada de decisão
		Caso o adm queira carregar uma existente, ler o arquivo.		
		*/
		try 
		{
			FileInputStream arquivo = new FileInputStream("arq.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br = new BufferedReader(input);
			String linha;
			do 
			{
				linha = br.readLine();
				if (linha != null) 
				{
					String [] textSep = linha.split(";");
					int pnt = Integer.parseInt(textSep[1]);
					//Integer a = Integer.valueOf(pnt);
					addtime(textSep[0], pnt);				
				}
			
			} while(linha != null);
	} catch (Exception e) 
		{
		System.out.print("erro \n");
		}
		
		Principal p = new Principal();
		int a1; //valor que vai ser recebido atraves da chave
		int a2 = 0; //número de abates
		String let = null;
		int opc = 0;
		while (opc != 9) 
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
				base2.put(11, 1);
				base2.put(12, 0);
				while (i < 12) 
				{
					System.out.println("informe a posição do squad: " + tabela.get(i).getName_squad()); 
					//receber o numero de abates e a posição
					Scanner ler3 = new Scanner(System.in);
					a1 = ler3.nextInt();
					a2 = ler3.nextInt();		
					a1 = base2.get(a1);
					addpontos(a1,a2,i);
					i++;
				}
			}
	 	}

}
