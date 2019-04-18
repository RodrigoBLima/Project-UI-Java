/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

/**
 *
 * @author rodrigo
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PageSplash pg = new PageSplash();
        pg.setVisible(true);
        
        PageLogin pl = new PageLogin();
        
        
        try{
            for (int i=0; i<=100; i++ ){
                Thread.sleep(30);
                pg.jLabel1.setText(Integer.toString(i));
                pg.jProgressBar1.setValue(i);
                
              if(i==100){
                  pg.setVisible(false);
                  pl.setVisible(true);
                  
              }
            }
                
        }catch(Exception e){
            
        }
    }
    
}
