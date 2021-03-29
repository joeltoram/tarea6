/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author MARIA RAMIREZ
 */
public class ClsEjemplos {
    public void ejemplo1(){
        String[] array={"Zacarías","María","Abel","Betty","Fabricio"};
        List<String> miLista=Arrays.asList(array);
       
        //miLista.add("Hola");
        imprimirTodo(miLista);
        //System.out.println("Lista antes orden"+miLista);
        Collections.sort(miLista);
        System.out.println("Lista ordenada="+miLista);
        int donde = Collections.binarySearch(miLista,"Abel");
        System.out.println("Abel se encuentra en el Xd"+ donde);
        Collections.shuffle(miLista);
        //System.out.println("Revueltos="+miLista);
        imprimirTodo(miLista);
    }

    //public void ejemplos() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    
    public void imprimirTodo (Collection coll){
        Iterator iter=coll.iterator();
        while(iter.hasNext()){
 
            
            
            
            
            System.out.println("elemento="+iter.next());
        }
    }
    public void pruebaArreglo()
    {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("uno");
        lista.add("dos");
        
        String[] a = new String[20];
        lista.toArray(a);
        String[] b = lista.toArray(new String[10]);
    }

}   

