
public class Principal {

    public static void main(String[] args) {
		
	
        Lista l = new Lista();
        
        l.adicionarComeco("Elemento 1");
        l.adicionarComeco("Elemento 2");
        l.adicionarComeco("Elemento 3");
        l.adicionarComeco("Elemento 4");
        l.adicionarComeco("Elemento 5");
        
        l.adicionarFim("Elemento 6");
        l.adicionarFim("Elemento 7");
        

        System.out.println("Lista após adição dos elementos no começo e no fim:");
        l.imprimir();
        
        l.adicionarPorPosicao("Cocada de leite", 2);
        System.out.println("\nLista atualizada:");
        l.imprimir();

        l.removerPorPosicao(3);
        System.out.println("\nElemento da posição 3 removido. Lista atualizada:");
        l.imprimir();

        }
    
}
