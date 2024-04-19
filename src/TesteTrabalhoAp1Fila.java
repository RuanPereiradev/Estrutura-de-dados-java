
public class TesteTrabalhoAp1Fila {

	public static void main(String[] args) {
	       
        Fila<Integer> fila = new Fila<>();
        int a;
        fila.enfileirar(11);
        fila.enfileirar(12);
        fila.enfileirar(13);
        fila.enfileirar(14);
        fila.enfileirar(15);
        a =  fila.fila_remove(14);
	    System.out.println("O valor removido da fila: "+a );
	    fila.imprimirFila(null);
	    
	    
	    No novoFrente = fila.inverter(fila.frente);
	    Fila f2 = new Fila();
	    f2.frente = novoFrente;
	    
	    System.out.println("Fila Invertida: ");
	    f2.imprimirFila(f2.frente);
	    
	   fila.qtdMaior(12);
	   
	   fila.pares(fila.frente);
	   
	   
	    
	}

}
