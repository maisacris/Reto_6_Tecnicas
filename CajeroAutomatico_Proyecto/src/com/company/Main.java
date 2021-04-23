package com.company;

import com.company.Cajero.DateAccount;

import javax.swing.*;

public class Main {
//Maria Isabel Cortes Herrera y Jhonny Galeano Barrero
    public static void main(String[] args) {
        DateAccount usuario = new DateAccount();
       int transacciones=0,opcion;

        do{
            System.out.println("|-----------------------------------------|");
            System.out.println("|          ESCOJA EL NUMERO               |");
            System.out.println("|            DE LA OPCION                 |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| 1. registrar cuenta |   3. Retirar      |");
            System.out.println("| 2. Consultar saldo  |   4. Depositar    |");
            System.out.println("| 5. Borrar cuenta    |   6. Terminar     |");
            System.out.println("|_________________________________________|");

            opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de la opción"));
            switch (opcion)
            {
                case 1:
                    opcion =1;
                    usuario.SignUpAdd();
                    transacciones = transacciones+1;
                break;

                case 2:
                    opcion =2;
                    usuario.ConsultarSaldo();
                    transacciones = transacciones+1;
                break;

                case 3:
                    opcion=3;
                    usuario.RetirarDinero();
                    transacciones=transacciones+1;
                break;

                case 4:
                    opcion =4;
                    usuario.DepositarDinero();
                    transacciones = transacciones+1;
                break;

                case 5:
                    opcion =5;
                    usuario.DeleteAccount();
                    transacciones = +1;
                    break;
                case 6:
                    opcion=6;
                    transacciones = +4;
                break;
                default:
                    System.out.println("Finish");
                break;
            }


        }while(transacciones < 4);

        System.out.println("Su Sesion ha sido finalizada con exito");




    }
}
