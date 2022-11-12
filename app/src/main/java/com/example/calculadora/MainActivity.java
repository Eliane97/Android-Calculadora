package com.example.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // Primero:
    //Declaro y creo objetos del tipo de cada view(componente)
    private EditText edt1,edt2;
    private RadioButton rdbsuma ,rdbresta, rdbmulti, rdbdivi;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Segundo:
        // los objetos creados anteriormente los relaciono con su respectivo componente visual (view), utilizando un casting(?
        edt1 = (EditText) findViewById(R.id.etn1);
        edt2 = (EditText) findViewById(R.id.etn2);
        rdbsuma = (RadioButton) findViewById(R.id.radioButtonS);
        rdbresta= (RadioButton) findViewById(R.id.radioButtonR);
        rdbmulti = (RadioButton) findViewById(R.id.radioButtonM);
        rdbdivi = (RadioButton) findViewById(R.id.radioButtonD);
        result = (TextView) findViewById(R.id.tview);}


    // Tercero: Creo el metodo que va a realizar los calculos,en este caso, suma y resta.
    // Metodo que se ejecutara cuando precionemos el boton calcular

    public void Calcular (View hola) {// Pasandole como argumento al parametro del metodo el objeto de tipo button
    // a) Recuperacion de los valores introducidos por el ususario: Casting de TextView a String
    String num1_string= edt1.getText().toString(); // declaro una variable de tipo string y le asgno el valor buscando el dato del componente
    String num2_string = edt2.getText().toString();
    // b) Casting de tipo string a int
    int num1_int = Integer.parseInt(num1_string); // Declaro variables de tipo int y le asigno valor parciando el string a int  con la clase Integrer y el metodo parseInt(), pasandole como argumento los string obtenido anteriormente
    int num2_int = Integer.parseInt(num2_string);

    //Cuarto: Ya obtenido los numeros, resliazo los calculos que necesito


        if (rdbsuma.isChecked()== true){ // un if por que hay dos radio botton para elejir
        int suma =  num1_int + num2_int; // calculo logico
        String resultado1 = String.valueOf(suma); // Nose puede guardar un int en un textview, tengo que parsear de int a string
        result.setText(resultado1);} // Establesco el valor obtenido en el objeto relacionando con el componente resultado

        else if ( rdbresta.isChecked() == true){
            int resta =  num1_int - (num2_int) ; // calculo logico
            String resultado2 = String.valueOf(resta);// Nose puede guardar un int en un textview, tengo que parsear de int a string
            result.setText(resultado2);}// Establesco el valor obtenido en el objeto relacionando con el componente resultado

        else if (rdbmulti.isChecked()== true){
            int multi = num1_int * num2_int; // calculo logico
            String resultado3 = String.valueOf(multi);// Nose puede guardar un int en un textview, tengo que parsear de int a string
            result.setText(resultado3); } //Establesco el valor obtenido en el objeto relacionando con el componente resultado
        else if (rdbdivi.isChecked()==true) {
            if (num2_int != 0) {
                int divi = num1_int / (num2_int);// Calculo logico
                String resultado4 = String.valueOf(divi);  // No puedo guardar un int en un textview entonces creo un objeto string y guardo el parseo de int a string
                result.setText(resultado4);// Establesco el valor string para el objeto relacionado con el componente
            }


            else  {
                Toast toast1 = Toast.makeText(getApplicationContext(), "Ingrese un valor distinto de cero", Toast.LENGTH_SHORT);
                toast1.show();}

                                             }


            }
        }
