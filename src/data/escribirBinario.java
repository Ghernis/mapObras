/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.*;
import java.util.*;

/**
 *
 * @author Hernan Gomez
 */
public class escribirBinario {
    
    String path="";
    public escribirBinario(String p){
        path = p;
    }
    public void escribirData(ArrayList in){
        
        try{
            FileOutputStream fo = new FileOutputStream(path);
    	    ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeInt(in.size());
            Iterator it = in.iterator();
            while(it.hasNext()){
                obras aux = (obras)it.next();
                os.writeObject(aux);
            }
            os.close();
    	    fo.close();
            
        }catch(Exception e){
            System.out.println("Exception "+e);
        }
    }
     public void escribirResultados(ArrayList in){
        
        try{
            FileOutputStream fo = new FileOutputStream(path);
    	    ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeInt(in.size());
            Iterator it = in.iterator();
            while(it.hasNext()){
                resultados aux = (resultados)it.next();
                os.writeObject(aux);
            }
            os.close();
    	    fo.close();
            
        }catch(Exception e){
            System.out.println("Exception "+e);
        }
    }
    public ArrayList leerData(){
        ArrayList data = new ArrayList();
        try{
            
            FileInputStream fi = new FileInputStream(path);
            ObjectInputStream is = new ObjectInputStream(fi);
            
            int cant = is.readInt();
            
            obras aux;
            
//            HashMap<String,obra> data = new HashMap<String,obra>();
            for(int i=0;i<cant;i++){
                
                    //System.out.println(i);
                    
                    aux = (obras)is.readObject();
                    data.add(aux);
                
                
                
            }
            
            is.close();
            fi.close();
            return data;
        }catch(Exception e){
            System.out.println("Exception: "+e);
            return null;
        }
       
    }
       public ArrayList leerResultados(){
        ArrayList data = new ArrayList();
        try{
            
            FileInputStream fi = new FileInputStream("rs.ext");
            ObjectInputStream is = new ObjectInputStream(fi);
            
            int cant = is.readInt();
            
            resultados aux;
            
//            HashMap<String,obra> data = new HashMap<String,obra>();
            for(int i=0;i<cant;i++){
                
                    //System.out.println(i);
                    
                    aux = (resultados)is.readObject();
                    data.add(aux);
                
                
                
            }
            
            is.close();
            fi.close();
            return data;
        }catch(Exception e){
            System.out.println("Exception: "+e);
            return null;
        }
       
    }
//    public void escribirData(Map in){
////        String path = "bd.ext";
//        try{
//            //----------------
//    	    FileOutputStream fo = new FileOutputStream(path);
//    	    ObjectOutputStream os = new ObjectOutputStream(fo);
//            os.writeInt(in.size());
//            Iterator it = in.entrySet().iterator();
//            while(it.hasNext()){
//                Map.Entry m = (Map.Entry)it.next();
//                String kkey = (String)m.getKey();
//                obra val = (obra)m.getValue();
////                os.writeInt(in.size());
//                os.writeObject(kkey);
//                os.writeObject(val);
////                for(int i=0;i<in.size();i++){
////                    os.writeDouble(val[i]);
////                }
//                
//            }
//            
//           
//                  
//    	    os.close();
//    	    fo.close();
//    	   //----------------
//           
//        }
//        catch(Exception e){
//            System.out.println("1 "+e);
//        }
//    }
//    public void escribirEtiquetas(etiqueta[] f){
//        String path = "etiquetas.ext";
//        try{
//            //----------------
//    	    FileOutputStream fo = new FileOutputStream(path);
//    	    ObjectOutputStream os = new ObjectOutputStream(fo);
//
//            
//            
//            for(int i=0;i<f.length;i++){
//                os.writeObject((etiqueta)f[i]);
//            }
//                
//               
//            
//                
//               
//                
//    	    os.close();
//    	    fo.close();
//    	   //----------------
//           
//        }
//        catch(Exception e){
//            System.out.println("1 "+e);
//        }
//        
//    }
//    public void escribirMatriz(Object[][] f){
//        //String path = "C:\\programas.H\\BD.FallasPT11\\orden.ext";
//        try{
//            //----------------
//    	    FileOutputStream fo = new FileOutputStream(path);
//    	    ObjectOutputStream os = new ObjectOutputStream(fo);
//
//            
//            os.writeInt(f.length);
//            os.writeInt(f[0].length);
//            for(int i=0;i<f.length;i++){
//                for(int j=0;j<f[0].length;j++){
//                    //os.writeInt((int)f[i]);
//                    os.writeObject(f[i][j]);
//                }
//                
//            }
//                
//      
//    	    os.close();
//    	    fo.close();
//    	   //----------------
//           
//        }
//        catch(Exception e){
//            System.out.println("1 "+e);
//        }
//        
//    }
//    public HashMap leerBinPC(){
//        
//        //String path = System.getProperty("user.dir")+"\\resources\\data.ext";
//        //String path = "C:\\FOTAE.H\\data.ext";
////        path="bd.ext";
//        HashMap<String,obra> data= new HashMap<String,obra>();
//        try{
//            
//            FileInputStream fi = new FileInputStream(path);
//            ObjectInputStream is = new ObjectInputStream(fi);
//            
//            int cant = is.readInt();
//            
//            obra aux = new obra();
//            String nombreAux="";
////            HashMap<String,obra> data = new HashMap<String,obra>();
//            for(int i=0;i<cant;i++){
//                
//                    //System.out.println(i);
//                    nombreAux=(String)is.readObject();
//                    aux = (obra)is.readObject();
//                    data.put(nombreAux, aux);
//                
//                
//                
//            }
//            
//            is.close();
//            fi.close();
//           
//            
//        }catch(Exception e){
//            System.out.println("Error: "+e);
//            //ap.consolePrint("Error 12:"+e);
//        }
//        return data;
//    }
    
}
