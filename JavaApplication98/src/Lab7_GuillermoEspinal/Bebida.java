/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7_GuillermoEspinal;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Bebida {
    
    private int codigo;
    private  String marca;
    private String nombre;
    private int cant_azucar;
    private double alcohol;//*
    
    private String nacional;
   // private boolean nacional;
    
    private int numero_lote;
    private String colorantes;
    private double precio;
    private int cantidad;
    private String fechavencimiento;

    public Bebida() {
    }

    public Bebida(int codigo, String nombre, String marca, int cant_azucar, double alcohol, String nacional, int numero_lote, String colorantes, double precio, int cantidad, String fechavencimiento) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.cant_azucar = cant_azucar;
        setAlcohol(alcohol);
        //this.nacional = nacional;
        //setNacional(verificar);
        this.nacional=nacional;
        this.numero_lote = numero_lote;
        this.colorantes = colorantes;//e(Azul-4 , Rojo-69 , Verde-420 , Amarillo-77 , Blanco-07 
        this.precio = precio;
        this.cantidad = cantidad;
        //***************
        this.fechavencimiento = fechavencimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant_azucar() {
        return cant_azucar;
    }

    public void setCant_azucar(int cant_azucar) {
        this.cant_azucar = cant_azucar;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        if (alcohol >100||alcohol <1) {
            setAlcohol(Double.parseDouble(JOptionPane.showInputDialog(null,"La cantidad de alcohol no puede ser mayor a 100")));
            
        }else {
            this.alcohol = alcohol;
        }
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }
    

  /*  public boolean isNacional() {
        return nacional;
    }

    public void setNacional(String verificar) {
        if (verificar.equals("si")) {
            this.nacional=true;
            
        }else if(verificar.equals("no")){
            this.nacional=false;
        }
    }
*/

    public int getNumero_lote() {
        return numero_lote;
    }

    public void setNumero_lote(int numero_lote) {
        this.numero_lote = numero_lote;
    }

    public String getColorantes() {
        return colorantes;
    }

    public void setColorantes(String colorantes) {
        this.colorantes = colorantes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   /* public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }*/

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
    
}
