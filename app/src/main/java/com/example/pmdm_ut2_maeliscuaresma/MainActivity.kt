package com.example.pmdm_ut2_maeliscuaresma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pmdm_ut2_maeliscuaresma.ui.theme.PMDMUT2MaelisCuaresmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PMDMUT2MaelisCuaresmaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaActividades(

                    )
                }
            }
        }
    }
}

@Composable
fun Titulo(texto: String) { // 1. Añadimos el parámetro modifier con un valor por defecto

        Text(text=texto)

}


@Composable
fun ActividadItem(
    nombre: String,
    categoria: String,
    modalidad: String,
    modifier: Modifier
) {
    Column {


        Image(
            painter = painterResource(R.drawable.cagadon),
            contentDescription = "Imagen de la actividad",
                    modifier = Modifier.size(50.dp)
        )

        Text(text = nombre)
        Text(text = categoria)


        Button(
            onClick = {
                Modifier.fillMaxWidth()
                println("Botón pulsado")
                // acción al pulsar
            }
        ) {
            Text("Ver detalle")
        }
    }

}



@Composable
fun PantallaActividades() {

    Column(
        modifier = Modifier.fillMaxSize(),
        //contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ActividadItem(
            nombre = "Taller de Android",
            categoria = "Tecnología",
            modalidad = "Presencial",
            modifier = Modifier.padding(16.dp)
        )

        ActividadItem(
            nombre = "Curso de marketing",
            categoria = "Marketing",
            modalidad = "Virtual",
            modifier = Modifier.padding(16.dp)
        )

        ActividadItem(
            nombre = "Taller de diseño",
            categoria = "Diseño",
            modalidad = "Presencial",
            modifier = Modifier.padding(16.dp)
        )
    }
}


