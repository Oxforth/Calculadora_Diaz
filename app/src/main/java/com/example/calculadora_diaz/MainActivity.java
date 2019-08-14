package com.example.calculadora_diaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;
    private Button n6;
    private Button n7;
    private Button n8;
    private Button n9;
    private Button n0;
    private Button punto;
    private Button factorizar;
    private Button borrar;
    private Button sumar;
    private Button restar;
    private Button multiplicar;
    private Button dividir;
    private Button potencia;
    private Button raiz;
    private Button enter;
    private TextView caja;
    private Double val1;
    private Double val2;
    boolean sum, rest, mul, div, fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();
        setClick();
    }

    private void find(){
        n1 = (Button)findViewById(R.id.btn1);
        n2 = (Button)findViewById(R.id.btn2);
        n3 = (Button)findViewById(R.id.btn3);
        n4 = (Button)findViewById(R.id.btn4);
        n5 = (Button)findViewById(R.id.btn5);
        n6 = (Button)findViewById(R.id.btn6);
        n7 = (Button)findViewById(R.id.btn7);
        n8 = (Button)findViewById(R.id.btn8);
        n9 = (Button)findViewById(R.id.btn9);
        n0 = (Button)findViewById(R.id.btn0);
        punto = (Button)findViewById(R.id.btnpunto);
        factorizar = (Button)findViewById(R.id.btnfactor);
        borrar = (Button)findViewById(R.id.btnborrar);
        sumar = (Button)findViewById(R.id.btnsuma);
        restar = (Button)findViewById(R.id.btnresta);
        multiplicar = (Button)findViewById(R.id.btnpor);
        dividir = (Button)findViewById(R.id.btndivide);
        raiz = (Button)findViewById(R.id.btnraiz);
        potencia = (Button)findViewById(R.id.btnpotencia);
        enter = (Button)findViewById(R.id.btnenter);
        caja = (TextView) findViewById(R.id.tvcaja);
    }

    private  void setClick(){
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "9");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "0");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + "0");
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText(caja.getText() + ".");
            }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caja.setText("");
            }
        });
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (caja == null) {
                    caja.setText("");
                } else {
                    val1 = Double.parseDouble(caja.getText() + "");
                    sum = true;
                    caja.setText(null);
                }
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (caja == null) {
                    caja.setText("");
                } else {
                    val1 = Double.parseDouble(caja.getText() + "");
                    rest = true;
                    caja.setText(null);
                }
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (caja == null) {
                    caja.setText("");
                } else {
                    val1 = Double.parseDouble(caja.getText() + "");
                    mul = true;
                    caja.setText(null);
                }
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (caja == null) {
                    caja.setText("");
                } else {
                    val1 = Double.parseDouble(caja.getText() + "");
                    div = true;
                    caja.setText(null);
                }
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Double.parseDouble(caja.getText() + "");

                if (sum == true) {
                    caja.setText(val1 + val2 + "");
                    sum = false;
                }

                if (rest == true) {
                    caja.setText(val1 - val2 + "");
                    rest = false;
                }

                if (mul == true) {
                    caja.setText(val1 * val2 + "");
                    mul = false;
                }

                if (div == true) {
                    caja.setText(val1 / val2 + "");
                    div = false;
                }
                if (fact == true) {
                    caja.setText(val2 + "");
                    div = false;
                }
            }
        });
    }
}
