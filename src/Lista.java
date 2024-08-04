public class Lista {
	
        private Celula cabeca;
        private Celula cauda;
        private int totalElementos;
        
        
        public void adicionarComeco(String nome) {
            Celula nova = new Celula(this.cabeca, nome);
        
            this.cabeca = nova;
            
            if(this.totalElementos ==0) {
                this.cauda = nova;
            }
            this.totalElementos++;
        }
        public void imprimir() {
            
            Celula aux = this.cauda;
            for(int cont =0; cont<this.totalElementos; cont++) {
                System.out.println(aux.getElemento());
                aux = aux.proxima;
            }
        }
        public void adicionarFim(String nome) {
            Celula nova = new Celula(nome);
                this.cauda.setProxima(nova);
                this.cauda = nova;
            if(this.totalElementos==0) {
                this.cabeca = nova;
            }
            this.totalElementos++;
        }

        public void adicionarPorPosicao(String elemento, int posicao) {
            if (posicao == 0) {
                adicionarComeco(elemento);
            } else if (posicao == this.totalElementos) {
                adicionarFim(elemento);
            } else {
                Celula anterior = this.cabeca;
                for (int i = 0; i < posicao - 1; i++) {
                    anterior = anterior.getProxima();
                }
                Celula nova = new Celula(anterior.getProxima(), elemento);
                anterior.setProxima(nova);
                this.totalElementos++;
            }
        }
    
        public void removerPorPosicao(int posicao) {
            if (posicao == 0) {
                this.cabeca = this.cabeca.getProxima();
                if (this.totalElementos == 1) {
                    this.cauda = null;
                }
            } else {
                Celula anterior = this.cabeca;
                for (int i = 0; i < posicao - 1; i++) {
                    anterior = anterior.getProxima();
                }
                anterior.setProxima(anterior.getProxima().getProxima());
                if (posicao == this.totalElementos - 1) {
                    this.cauda = anterior;
                }
            }
            this.totalElementos--;
        }

    }
    

