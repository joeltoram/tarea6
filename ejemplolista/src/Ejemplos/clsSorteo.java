/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import Conex.Clsconexion;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author joel torres
 */
public class clsSorteo {
    public void tarea(){
    
     Clsconexion cn=new Clsconexion();
        Statement st;
        ResultSet rs;
        String inserta, sele;
        ArrayList<String>datos = new ArrayList<String>();
        ArrayList<String>datosSeleccion = new ArrayList<String>();
        try {
            st= cn.con.createStatement();
            rs=st.executeQuery("select * from tablaNombres");
            while (rs.next ()){
                inserta = rs.getNString("nombre");
                datos.add(inserta);
            }
            
            while(datosSeleccion.size()!=10)
            {
                Collections.shuffle(datos);
                sele= datos.get(1);
                datosSeleccion.add(sele);
                datos.remove(sele);
            }
            imprimirTodo(datosSeleccion);
            
            cn.con.close();
        } catch (Exception e){
            System.out.println("Error"+ e);
            
        }
        
        
    }
    public void imprimirTodo (Collection coll){
        Iterator iter=coll.iterator();
        while(iter.hasNext()){
            System.out.println("Triunfadores="+iter.next());
        }
    }
    
    
}
