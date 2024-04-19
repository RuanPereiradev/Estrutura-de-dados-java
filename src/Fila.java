
public class Fila<T> {
	
	public No frente;
	public No atras;
	
	public Fila() {
		frente = null;
		atras = null;
	}
	
	public void enfileirar(int elemento) {
		No novoNo = new No(elemento);
		
		if(frente == null) {
			frente=novoNo;
			atras=novoNo;
		}else {
			atras.setProximo(novoNo);
			atras = novoNo;
		}
	}
	public int fila_remove(int elemento) {
		No atual = frente;
		No anterior = null;
		
		if(frente == null) {
			return -1;
		}
		if(frente.getElemento()==elemento) {
			int valorRemovido = frente.getElemento();
			frente = frente.getProximo();
			if(frente == null) {
				atras= null;
			}
			return valorRemovido;
		}
		
		
		while(atual != null & atual.getElemento() != elemento) {
			anterior = atual;
			atual = atual.getProximo();
		}
		if(atual !=null) {
			int valorRemovido = atual.getElemento();
			anterior.setProximo(atual.getProximo());
			if(atual == atras) {
				atras = anterior;
			}
			return valorRemovido;
		}
		return -1;
		
	}
	
	public void imprimirFila(No Frente) {
	    No atual = frente;
	    while (atual != null) {
	        System.out.print(atual.getElemento() + " ");
	        atual = atual.getProximo();
	    }
	    System.out.println();
	}
	
	public int qtdMaior(int n) {
		int contador=0;
		No atual = atras;
		
		System.out.println("quantidade de valores maiores que "+n+ ":");
		while(atual != null) {
			if(atual.getElemento()>n) {
				contador++;
			}
			atual=atual.getProximo();

		}
		System.out.println(contador);
		return contador;
	}
	
	public  No inverter(No f) {
		No atual = f;
		if(f==null || f.getProximo() == null) {
			System.out.println("Lista Vazia");
			return f;
		}else {
			No resto = inverter(f.getProximo());
			f.getProximo().setProximo(f);
			f.setProximo(null);
			return resto;
		}
		
	}
	
	public int pares (No f) {
		int contador =0;
		No atual = atras;
		
		System.out.println("Qtd de elementos pares nessa fila");
		while(atual != null) {
			if(atual.getElemento()%2==0) {
				contador++;
			}
			atual = atual.getProximo();		
		}
		System.out.println(contador);
		return contador;
	}
	
}



