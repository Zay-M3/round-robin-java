/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robin;

/**
 *
 * @author oscar
 */
public class Procesos {
    //variables de entrada
    private int numProcesos;
    private int rafaga;
    private int quantum;
    private int time;
    //Variables para la salida
    private int tiempoProceso;
    private int tiempoSalida;
    private int tiempoEntrada;
    
    //constructor para la entrada

    public Procesos(int numProcesos, int rafaga, int quantum, int time) {
        this.numProcesos = numProcesos;
        this.rafaga = rafaga;
        this.quantum = quantum;
        this.time = time;
    }

    public int getNumProcesos() {
        return numProcesos;
    }

    public void setNumProcesos(int numProcesos) {
        this.numProcesos = numProcesos;
    }

    public int getRafaga() {
        return rafaga;
    }

    public void setRafaga(int rafaga) {
        this.rafaga = rafaga;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTiempoProceso() {
        return tiempoProceso;
    }

    public void setTiempoProceso(int tiempoProceso) {
        this.tiempoProceso = tiempoProceso;
    }

    public int getTiempoSalida() {
        return tiempoSalida;
    }

    public void setTiempoSalida(int tiempoSalida) {
        this.tiempoSalida = tiempoSalida;
    }

    public int getTiempoEntrada() {
        return tiempoEntrada;
    }

    public void setTiempoEntrada(int tiempoEntrada) {
        this.tiempoEntrada = tiempoEntrada;
    }

    @Override
    public String toString() {
        return "Procesos{" + "numProcesos=" + numProcesos + ", rafaga=" + rafaga + ", quantum=" + quantum + ", time=" + time + ", tiempoProceso=" + tiempoProceso + ", tiempoSalida=" + tiempoSalida + ", tiempoEntrada=" + tiempoEntrada + '}';
    }
    
    
    
    
    

   
}
