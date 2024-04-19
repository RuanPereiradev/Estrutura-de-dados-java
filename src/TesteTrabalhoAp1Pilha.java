
public class TesteTrabalhoAp1Pilha {

	public static void main(String[] args) {

		
		 Pilha<Integer> p1 = new Pilha<>();
		 p1.empilhar(10);
		 p1.empilhar(20);
		 p1.empilhar(25);
		 p1.empilhar(30);
		int a = p1.desempilhar(p1.topo(null));
		 p1.mostrarPilha();
		 System.out.println("Elemento no topo da pilha p1: "+p1.topo(null));
		 
		 Pilha<Integer> p2 = new Pilha<>();
		 p2.empilhar(3);
		 p2.empilhar(4);
		 p2.empilhar(5);
		 System.out.println(p2.empilhaPares(p1.topo, p2.topo));
	}

}
