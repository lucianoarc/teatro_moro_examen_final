
package teatro_moro_final;

public class Entradas {
    
    private String ubicacion;
    private int preciobase;
    private double descuento;
    private int edad;
    private double preciofinal;
    

    public Entradas (int edad, String ubicacion, int preciobase, double descuento, double preciofinal){ //constructor con las variables o atributos dentro
        this.edad = edad;                                                       //this=darle valor a esta clase que era edad
        this.ubicacion = ubicacion;
        this.preciobase = preciobase;
        this.descuento = descuento;
        this.preciofinal = preciofinal;                                         //constructor con las variables o atributos dentro
        
} 


public int getEdad() {
        return edad;
    }


public String getubicacion() {                                              
        return ubicacion;
    }
public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        calcularPrecioFinal();
}
public int getpreciobase() {
        return preciobase;
    }
 public void setPreciobase(int preciobase) {
        this.preciobase = preciobase;
        calcularPrecioFinal();
 }
  
public double getdescuento() {
        return descuento;
    }
public void setDescuento(double descuento) {
        this.descuento = descuento;
        calcularPrecioFinal();
}

public double getpreciofinal() {
        return preciofinal;
    }
public void calcularPrecioFinal() {
        double precioBaseDouble = (double) this.preciobase;
        this.preciofinal = precioBaseDouble - (precioBaseDouble * (this.descuento / 100));
    }
@Override
    public String toString() {
        return "Entrada{" +
                "edad=" + edad +
                ", ubicacion='" + ubicacion + '\'' +
                ", precioBase=" + preciobase+
                ", descuento=" + descuento +
                ", precioFinal=" + preciofinal +
                '}';
                            }
}
 

