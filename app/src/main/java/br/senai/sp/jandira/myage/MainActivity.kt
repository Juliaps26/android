package br.senai.sp.jandira.myage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myage.ui.theme.MyAgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAgeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Dentro do surface
                    // Dessa forma fica um em cima do outro, o surface organiza
//                    Text(text = "Senai Prof. Vicente Amato")
//                    Text(text = "Sesi")
                    
                    // Column organiza um em baixo do outro


                }
            }
        }
        @Composable
        fun MinhaTela() {
            Column {
                Text(
                    text = "Senai Prof. Vicente Amato",
                    fontSize = 32.sp,
                    color = Color.Green
                )

                Text(
                    text = "Sesi",
                    color = Color.Magenta,
                    fontSize = 48.sp,
                    // Para deixar em negrito
                    fontWeight =  FontWeight.Bold

                )

                Row {
                    Column {
                        Button(

                            onClick = { /*TODO*/ },
                            // Para a cor do botao BUTTONDEFAULTS tem um metodo chamado buttonColors
                            colors = ButtonDefaults.buttonColors(
                                // Cor hexadeximal - comeca com 0x (padrao) dps dois de aplha(intensidade/ transparencia da cor) e outros 6 a cor
                                containerColor = Color(0xF7FF9DFA),
                                // A cor do botao ativo
                                contentColor = Color(0xF7FF9DFA)

                            )
                        ) {
                            Text(text = "Clique")
                            Text(text = "Abra")

                        }
                    }
                    Column {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Júlia")
                        }
                    }
                }


            }
        }

    }
        }


