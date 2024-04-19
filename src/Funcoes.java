public class Funcoes<T> {

	public No inicio;
	public No ultimo;
	private int tamanho;


	public void insere(int elemento) {
	    No novoNo = new No(elemento);
	    
	    
	    if (this.inicio == null) {
	        this.inicio = novoNo; 
	    } else {
	        
	        No atual = this.inicio;
	        while (atual.proximo != null) {
	            atual = atual.proximo;
	        }
	        atual.proximo = novoNo;
	    }
	    
	    
	    this.ultimo = novoNo;
	    this.tamanho++;
	}
	
	public void remove(int elemento) {
		No atual = inicio;
		No anterior = null;
		if(inicio == null) {
			return;
		}
		if(inicio.getElemento()==elemento) {
			inicio=inicio.getProximo();
			return;
		}
		while(atual !=null & atual.getElemento() != elemento) {
			anterior = atual;
			atual = atual.getProximo();
		}
		
		if(atual != null) {
			anterior.setProximo(atual.getProximo());
		}
		
	}
	
	public void imprimirLista(No inicio) {
	    No atual = inicio;
	    while (atual != null) {
	        System.out.print(atual.getElemento() + " ");
	        atual = atual.getProximo();
	    }
	    System.out.println();
	}

	
	public int comprimento(No l) {
		//l = numero de nós

		int contador= 0; 
		l = inicio;
		if(l == null) {
			System.out.println("Lista vazia");
		}else {
			while(l != null) {		 
				contador++;			 
				l=l.getProximo();		
			}			

		}
		return contador;

	}
	
	public int menores(No l,int n) {
		int contador = 0;
		No atual = l;
		if(l==null) {
			System.out.println("Lista vazia");
			return 0;
		}else {
			while(atual !=null) {
				if(atual.elemento<n) {
					contador++;

				}
				atual=atual.proximo;
			}
			System.out.println();

			return contador;
		}
	}
	
	public int soma(No l) {

		int soma = 0;

		for(No atual = l; atual!=null;atual=atual.proximo) {
			soma += atual.elemento;
		}
		return soma;

	}

	public int primo(No l) {
		No atual = l;
		int tamanho = 0;
		System.out.println("Numeros primos: ");
		while(atual!=null) {
			boolean primo = true;
			if(atual.elemento<=1) {
				primo = false;
			}else {
				for(int i=2;i<=Math.sqrt(atual.elemento);i++) {
					if(atual.elemento%2==0) {
						primo = false;
						break;
					}
				}
			}if(primo) {
				System.out.println(atual.elemento);
				tamanho++;
			}
			atual=atual.proximo;
		}
		return tamanho;
	}
	
	public No lst_conc(No l1, No l2){
		if(l1==null) {
			return l2;
		}
		
		No atual = l1;
		
		while(atual.getProximo() != null) {
			atual=atual.getProximo();
			
			
		}
		atual.setProximo(l2);
		

		return l1;
	}
	
	
	
	public No lst_diferenca(No l1, No l2) {
	    No atualL1 = l1;
	    No anteriorL1 = null;	    	    
	    while (atualL1 != null) {	        
	        No atualL2 = l2;
	        boolean encontrado = false;	        
	        while (atualL2 != null) {	            
	            if (atualL1.getElemento()==atualL2.getElemento()) {	         
	                encontrado = true;
	                break;
	            }	           
	            atualL2 = atualL2.getProximo();
	        }
	        if (!encontrado) {
	            if (anteriorL1 == null) {
	                
	                l1 = l1.getProximo();
	            } else {
	                anteriorL1.setProximo(atualL1.getProximo());
	            }
	        } else {   
	            anteriorL1 = atualL1;
	        } 
	        atualL1 = atualL1.getProximo();
	    }
	    return l1;
	}
	
}


