package com.company.Cajero;

import javax.swing.*;
import java.util.ArrayList;

public class DateAccount {

    private ArrayList<Object> datosPersonales = new ArrayList<>();
    private String nombre;
    private String celular;
    private String identificacion;
    private String puntero;
    private String tipoDedocumento;
    private String pais;
    private double saldo = 1000000;
    private double retiro;
    private double abono;
    private int swicth, i = 0, j = 1, k = 2, m = 3, n = 4, l = 5, numUse, completo;


    public void SignUpAdd() {// agregar cuenta


        do {

            identificacion = JOptionPane.showInputDialog("ingrese su identificacion");
            tipoDedocumento = JOptionPane.showInputDialog("ingrese el tipo de documento");
            nombre = JOptionPane.showInputDialog("ingrese su nombre completo");
            pais = JOptionPane.showInputDialog(" ingrese el nombre del pais de procedencia");
            do {
                celular = JOptionPane.showInputDialog("ingresa el # celular\n <si ingresa mas de 10 digitos\n no lo acepará");
            } while (celular.length() != 10);

            this.datosPersonales.add(i, identificacion);
            this.datosPersonales.add(j, tipoDedocumento);
            this.datosPersonales.add(k, nombre);
            this.datosPersonales.add(m, pais);
            this.datosPersonales.add(n, celular);
            this.datosPersonales.add(l, saldo);


            swicth = Integer.parseInt(JOptionPane.showInputDialog("si desea agg otro nombre y cedula,\n ingrese <1> de lo contrario <2>"));
        } while (swicth == 1);

        System.out.println(" Los datos ingresados son " + datosPersonales.toString());

    }

    public void BuscarDato() {

        puntero = JOptionPane.showInputDialog("ingrese su numero de documento");
        numUse = Integer.parseInt(String.valueOf(this.datosPersonales.indexOf(puntero)));
        System.out.println("Identificacion: " + datosPersonales.get(numUse) + "\nTipo de identifiacion: "
                + datosPersonales.get(numUse + 1) + "\nnombre: " + datosPersonales.get(numUse + 2)
                + "\n pais: " + datosPersonales.get(numUse + 3) + "\n celular: " + datosPersonales.get(numUse + 4) +
                "\n Saldo: " + datosPersonales.get(numUse + 5));

    }

    public void DeleteAccount() {
        try {

            puntero = JOptionPane.showInputDialog("ingrese su numero\n de cc de la cuenta a eliminar");
            numUse = Integer.parseInt(String.valueOf(this.datosPersonales.indexOf(puntero)));
            i = +numUse;
            j = +i;
            k = +j;
            m = +k;
            n = +m;
            l = +n;
            datosPersonales.remove(numUse);
            datosPersonales.remove(i);
            datosPersonales.remove(j);
            datosPersonales.remove(k);
            datosPersonales.remove(m);
            datosPersonales.remove(n);


            System.out.print(getDatosPersonales());
        }catch (IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"la cuenta ingresada no existe");
        }
        finally {
            JOptionPane.showMessageDialog(null,"sesion finalizada");
        }
    }

    public void RetirarDinero() {
        try {
            puntero = JOptionPane.showInputDialog("ingrese su numero de documento \n para ingresar a su cuenta");
            numUse = Integer.parseInt(String.valueOf(this.datosPersonales.indexOf(puntero)));
            completo = numUse + 5;
            retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar\n catidad maxima 300000$"));
            saldo = (double) datosPersonales.get(completo);
            if (retiro <= saldo && retiro <= 300000) {
                saldo = saldo - retiro;
                System.out.println("\n_________________RETIRO________________");
                System.out.print("Usted retiro: " + retiro + "$ a su cuenta");
            }
            if (retiro > saldo || retiro > 300000) {
                System.out.println("La transaccion es mayor a el saldo actual \n o al es mayor al retiro maximo permitido");
            }

            datosPersonales.set(completo, saldo);
        }catch (IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"la cuenta ingresada no existe");
        }
        catch (ClassCastException ex){
            JOptionPane.showMessageDialog(null,"valor no permitido");
        }
        finally {
            JOptionPane.showMessageDialog(null,"sesion finalizada");
        }
    }

    public void DepositarDinero() {
        try {
            puntero = JOptionPane.showInputDialog("ingrese su numero de documento \n para ingresar a su cuenta");
            numUse = Integer.parseInt(String.valueOf(this.datosPersonales.indexOf(puntero)));
            completo = numUse + 5;
            abono = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar\n cantidad maxima 300000$"));
            saldo = (double) datosPersonales.get(completo);
            if (abono <= 300000) {
                saldo = saldo + abono;
                System.out.println("\n______________DEPOSITO________________");
                System.out.print("Usted deposito: " + abono + "$ a su cuenta ");
            }
            if (abono > 300000) {
                System.out.println("La transaccion es mayor\n a el deposito maximo permitido");
            }

            datosPersonales.set(completo, saldo);
        }catch (IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"la cuenta ingresada no existe");
        }catch (ClassCastException ex) {
            JOptionPane.showMessageDialog(null, "valor no permitido");
        }
        finally {
            JOptionPane.showMessageDialog(null,"sesion finalizada");
        }
    }

    public void ConsultarSaldo() {
        try {
            puntero = JOptionPane.showInputDialog("ingrese su numero de documento \n para ingresar a su cuenta");
            numUse = Integer.parseInt(String.valueOf(this.datosPersonales.indexOf(puntero)));
            System.out.println("\n________________SALDO ACTUAL_____________");
            System.out.println("Identificacion: " + datosPersonales.get(numUse) + "\nTipo de identifiacion: "
                    + datosPersonales.get(numUse + 1) + "\nnombre: " + datosPersonales.get(numUse + 2)
                    + "\n pais: " + datosPersonales.get(numUse + 3) + "\n celular: " + datosPersonales.get(numUse + 4) +
                    "\n Saldo: " + datosPersonales.get(numUse + 5));
        }catch (IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"la cuenta ingresada no existe");
        }
        finally {
            JOptionPane.showMessageDialog(null,"sesion finalizada");
        }
    }




    public ArrayList<Object> getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(ArrayList<Object> datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
