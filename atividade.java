package atividade3;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.*;

public class PilhaFila {

    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>(5);
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
        ArrayQueue<Integer> fila = new ArrayQueue<>(10);

        // Pass 1:
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        
        // Passo 2:
        while(!lista.isEmpty()){
            pilha.push(lista.get(0));
            lista.remove(0);
        }

  
        // Passo 3:
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }

  
        // Passo 4:
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        // Passo 5:
        // Repetição passo 2:
        while(!lista.isEmpty()){
            pilha.push(lista.get(0));
            lista.remove(0);
        }

        
        // Repetição passo 3:
        while(!pilha.isEmpty()){
            fila.add(pilha.pop());
        }
        
        // Passo 6:
        System.out.println(fila);
    
    }
    
}