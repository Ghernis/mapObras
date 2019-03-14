/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gherni
 */
public class leerCSV {
    String path;
    public leerCSV(String path){
        this.path = path;
    }
    public ArrayList leer(){
        
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy=";";
        try{
            
            br = new BufferedReader(new FileReader(path));
            ArrayList data = new ArrayList();
            while((line = br.readLine())!=null){
                String[] aux = line.split(cvsSplitBy);
              
                
                
                
//                g.setPeriodo();
                
                data.add(aux);
            }
            return data;
        }
        catch(FileNotFoundException e){
                    e.printStackTrace();
                    return null;
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        
        }
        finally{
            if(br!=null){
                try{
                    br.close();
                    
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
