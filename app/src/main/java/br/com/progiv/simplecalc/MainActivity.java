package br.com.progiv.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i = 0;                    //índice de números para operação
    int count = 0;                //Qte de caracteres de números. Máximo 7
    int[] Result;                 //Array nos números digitados
    int Total = 0;                //Resultadostatic
    int INVALID = 9999999; //variável estática para controle de qte de dígitos

    String operacao; //operação a ser executado

    TextView RESULTSCREEN;
    Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn00;
    Button btnSoma, btnSub, btnMult, btnDiv, btnIgual, btnLimp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = new int[2]; //Iniciando o array//

        // Link com os componentes da tela:

        RESULTSCREEN = (TextView) findViewById(R.id.RESULTSCREEN);
        btn00 = (Button) findViewById(R.id.button0);
        btn01 = (Button) findViewById(R.id.button1);
        btn02 = (Button) findViewById(R.id.button2);
        btn03 = (Button) findViewById(R.id.button3);
        btn04 = (Button) findViewById(R.id.button4);
        btn05 = (Button) findViewById(R.id.button5);
        btn06 = (Button) findViewById(R.id.button6);
        btn07 = (Button) findViewById(R.id.button7);
        btn08 = (Button) findViewById(R.id.button8);
        btn09 = (Button) findViewById(R.id.button9);

        btnSoma = (Button) findViewById(R.id.buttonsoma);
        btnSub = (Button) findViewById(R.id.buttonsub);
        btnMult = (Button) findViewById(R.id.buttonmult);
        btnDiv = (Button) findViewById(R.id.buttondiv);
        btnLimp = (Button) findViewById(R.id.buttonLimpar);
        btnIgual = (Button) findViewById(R.id.buttonigual);


        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10);
                    count++;

                        //Zera o valor de total para não dar erro
                }
                Total = 0;
                exibirResultado(); //Troca o resultado na tela

            }
        });

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 1;
                    count++;
                }
                Total = 0;
                exibirResultado(); //Troca o resultado na tela
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 2;
                    count++;
                }
                Total = 0;
                exibirResultado(); //Troca o resultado na tela
            }
        });


        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 3;
                    count++;
                }

                Total = 0;          //Zera o valor de total para não dar erro}});
                exibirResultado();    //Troca o resultado na tela
                }
        });


        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 4;
                    count++;
                }

                Total = 0;          //Zera o valor de total para não dar erro}});
                exibirResultado();    //Troca o resultado na tela
            }
        });


        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 5;
                    count++;
                }

                Total = 0;          //Zera o valor de total para não dar erro}});
                exibirResultado();    //Troca o resultado na tela
            }
        });


        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 6;
                    count++;
                }

                Total = 0;          //Zera o valor de total para não dar erro}});
                exibirResultado();    //Troca o resultado na tela
            }
        });


        btn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 7;
                    count++;
                }

                Total = 0;          //Zera o valor de total para não dar erro}});
                exibirResultado();    //Troca o resultado na tela
            }
        });


        btn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 8;
                    count++;
                }

                Total = 0;          //Zera o valor de total para não dar erro}});
                exibirResultado();    //Troca o resultado na tela
            }
        });


        btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count < 7) {
                    Result[i] = (Result[i] * 10) + 9;
                    count++;
                }

                Total = 0;          //Zera o valor de total para não dar erro}});
                exibirResultado();    //Troca o resultado na tela
            }
        });

        // botões de ação
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 1) calcular();

                operacao = "soma";
                proximoNumero();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 1) calcular();

                operacao = "sub";
                proximoNumero();
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 1) calcular();

                operacao = "mult";
                proximoNumero();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 1) calcular();

                operacao = "div";
                proximoNumero();
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
                Total = 0; //Zera o valor de total para não dar erro
                count=0;
            }
        });

        btnLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpar();
            }
        });

    }


    //exibição em tela:
    private void exibirResultado(){
        if(Total != 0 && Total < INVALID){
            //se o valor total for válido:
            String tela = String.valueOf(Total);
            RESULTSCREEN.setText(tela);
        }else if (Total > INVALID) {
            //se o valor total for inválido:
            String tela = "ERROR";
            RESULTSCREEN.setText(tela);
        }else {
            //se ainda não foi calculado exibir o numeral
            String tela = String.valueOf(Result[i]);
            RESULTSCREEN.setText(tela);
        }
    }

    //Passa o array para a próxima posição
    private void proximoNumero(){
        count = 0;
        i = 1;
    }

    //Limpar a tela:
    private void limpar(){
        i = 0;
        Result[0] = 0;
        Result[1] = 0;
        Total = 0;
        count = 0;
        exibirResultado();
    }

    private void calcular(){
        if(i == 1){
            double value;
            switch (operacao){
                //Executa as operações e sai do switch
                case "soma":
                    Total = (Result[0] + Result[1]);
                    break;
                case "sub":
                    Total = Result[0] - Result[1];
                    break;
                case "div":
                    Total = Result[1] == 0 ? Result[0] : Result[0] / Result[1];
                    break;
                case "mult":
                    Total = Result[0] * Result[1];
                    break;
            }
            //Se for um valor inválido
            if (Total<INVALID) {
                Result[0] = Total; //Para executar mais operações
                Result[1] = 0; //Passa para o segundo valor
                i = 1;
            }

            exibirResultado(); //Troca o resultado na tela
        }
    }


}
