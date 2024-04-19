/**
 * 
 */

/**
 * @author 55889
 *
 */
public class TesteTrabalhoAp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	  Funcoes<Integer> list = new Funcoes<>();
		
		list.insere(60);
		list.insere(13);
		list.insere(45);
		list.insere(28);
		list.insere(41);
		list.insere(37);
		list.imprimirLista(list.inicio);
		list.remove(37);
		list.imprimirLista(list.inicio);
		
		System.out.println("Numeros de nós com valores menores que 30: "+list.menores(list.inicio, 30));
		System.out.println("O comprimento da lista é: "+list.comprimento(list.inicio));
		System.out.println("A soma dos valores nos nós é: "+list.soma(list.inicio));
		System.out.println("Números de nós com valores primos "+list.primo(list.inicio));
		

		  Funcoes<Integer> list2 = new Funcoes<>();

		  	list2.insere(28);
			list2.insere(45);
			list2.insere(130);
			
			No list3 = list.lst_conc(list.inicio, list2.inicio);
			
			list.imprimirLista(list3);
			
			No l1 = list.lst_diferenca(list.inicio, list2.inicio);
			list.imprimirLista(l1);
			
	 		         
		        
	}
		         
			
		        
			 
			
}

