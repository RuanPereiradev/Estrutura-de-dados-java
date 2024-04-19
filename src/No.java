
 class No {
    public int elemento;
    public No proximo;

    public No(int elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(int elemento, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[").append(elemento).append("]");
        if (proximo != null) {
            builder.append(" -> ").append(proximo.toString());
        }
        return builder.toString();
    }
	
	
  
}

