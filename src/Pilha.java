 public class Pilha<T> {
	public No topo;
	
	public Pilha() {
		topo = null;
	}
	public void empilhar(int elemento) {
		No novoNo = new No(elemento);
		if(topo == null) {
			topo = novoNo;
		}
		else {
		novoNo.setProximo(topo);	
		topo = novoNo;
		}
	}
	
	public int desempilhar(int elemento) {
		if(topo==null) {
			throw new IllegalStateException("Pilha vazia");
		
	}
		int valor = topo.getElemento();
		topo = topo.getProximo();
		
		return valor;

	}
	public boolean pilhaVazia() {
		return topo==null;
	}
	
	public void mostrarPilha() {
	    No atual = topo;
	    while (atual != null) {
	        System.out.println(atual.getElemento());
	        atual = atual.getProximo();
	    }
	}
	
	
	public int topo(No n) {
		if(pilhaVazia()) {
			throw new IllegalStateException("Pilha vazia");
		}else {
			return topo.elemento;
		}
	
	}
	
	public int impares(No t) {
		No atual = topo;
		System.out.println("Numeros impares na pilha");
		
		while(atual!=null){
			if((atual.elemento)%2!=0) {
				System.out.println(atual.elemento); 
			}
			atual=atual.proximo;

		}
		return 0;
		
	}
	
	  public No empilhaPares(No p1, No p2) {
	        No pilhaPares = null; // Inicializa a pilha de pares

	        // Percorre a pilha p1
	        while (p1 != null) {
	            int elemento = p1.getElemento();
	            // Se o elemento for par, cria um novo nó e o insere na pilhaPares
	            if (elemento % 2 == 0) {
	                pilhaPares = inserirOrdenado(pilhaPares, new No(elemento));
	            }
	            p1 = p1.getProximo();
	        }

	        // Percorre a pilha p2
	        while (p2 != null) {
	            int elemento = p2.getElemento();
	            // Se o elemento for par, cria um novo nó e o insere na pilhaPares
	            if (elemento % 2 == 0) {
	                pilhaPares = inserirOrdenado(pilhaPares, new No(elemento));
	            }
	            p2 = p2.getProximo();
	        }

	        return pilhaPares;
	    }

	    private No inserirOrdenado(No pilha, No novoNo) {
	        if (pilha == null || novoNo.getElemento() <= pilha.getElemento()) {
	            novoNo.setProximo(pilha);
	            return novoNo;
	        } else {
	            No atual = pilha;
	            while (atual.getProximo() != null && novoNo.getElemento() > atual.getProximo().getElemento()) {
	                atual = atual.getProximo();
	            }
	            novoNo.setProximo(atual.getProximo());
	            atual.setProximo(novoNo);
	            return pilha;
	        }
	    }
	    
	    
	    
	    
	    
 }
	
	
 
		
		
	
 

