
import java.util.TimerTask;

public class Adversario extends TimerTask implements Constantes{
    
    public int posicionX;
    public int posicionY;
    public Escenario escenario;
    
    
    public Adversario(Escenario escenario,int xi,int yi) {
        posicionX=xi;
        posicionY=yi;
        this.escenario=escenario;
        
    }
    
    public void moverArriba(){
        if (posicionY > 0 ) {
           if ( escenario.celdas[posicionX][posicionY-1].tipo != 'O' && 
               escenario.celdas[posicionX][posicionY-1].tipo != 'R' &&
               escenario.celdas[posicionX][posicionY-1].tipo != 'J') {   
              
              escenario.celdas[posicionX][posicionY].tipo='V';
              posicionY=posicionY-1;
              escenario.celdas[posicionX][posicionY].tipo='A';
           }
        }
    }
    
    public void moverAbajo(){
       if (posicionY+1 < NUMERO_CELDAS_LARGO ) {
           if ( escenario.celdas[posicionX][posicionY+1].tipo != 'O' && 
               escenario.celdas[posicionX][posicionY+1].tipo != 'R' &&
               escenario.celdas[posicionX][posicionY+1].tipo != 'J') { 
              
              escenario.celdas[posicionX][posicionY].tipo='V';
              posicionY=posicionY+1;
              escenario.celdas[posicionX][posicionY].tipo='A'; 
              
              
           }
        }
    }
    
    public void moverIzquierda(){
         if (posicionX > 0 ) {
           if ( escenario.celdas[posicionX-1][posicionY].tipo != 'O' && 
                escenario.celdas[posicionX-1][posicionY].tipo != 'R' &&
                escenario.celdas[posicionX-1][posicionY].tipo != 'J') { 
              
              escenario.celdas[posicionX][posicionY].tipo='V';
              posicionX=posicionX-1;
              escenario.celdas[posicionX][posicionY].tipo='A'; 
           }
        }
    }
    
    public void moverDerecha(){
        if (posicionX+1 < NUMERO_CELDAS_ANCHO  ) {
          if ( escenario.celdas[posicionX+1][posicionY].tipo != 'O' && 
               escenario.celdas[posicionX+1][posicionY].tipo != 'R' &&
               escenario.celdas[posicionX+1][posicionY].tipo != 'J') { 
              escenario.celdas[posicionX][posicionY].tipo='V';
              posicionX=posicionX+1;
              escenario.celdas[posicionX][posicionY].tipo='A'; 
           }
           
        }
    }
    
    @Override
    public void run() {
       
       
      
    }
         
}

