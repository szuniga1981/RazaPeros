package cl.sebastian.razaperos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// Descripción
/* []   1. Muestre un listado de razas de perritos.
   []   2. Al seleccionar una raza de perritos, muestre un listado de fotos de perros de esa raza.
   []   3. Al darle un click largo sobre la imagen de un perro, puedas guardar esa foto especifica como favorita.
   []   4. Debe haber un listado de fotos con los perros favoritos. (opcional)
   */

//Requerimientos generales
/*
[]● La prueba puede ser realizada en forma individual o grupal de máximo 3 integrantes.
[]● Crear una aplicación Android nativa en lenguaje Java.
[]● Utilizar un patrón de diseño MVP.
[]● Utilizar un sistema de control de versiones(Git). Como mínimo un un commit por parte.
[]● Respetar las convenciones de nombres Java, y seguir las buenas practicas recomendadas.
[]● Seguir las recomendaciones SOLID.
*/

//Requerimientos específicos
/*
[]●   Debe consumir datos desde una API, se sugiere Dog.ceo. (si decide consumir otra API, es su responsabilidad realizar la conexión y
    mapeo de datos correspondiente, el requerimiento mínimo es un listado de atributos y listado de fotografías).
[]● API dog.ceo.
[]● Utilizar como EndPoints.
    ○ breeds/list/ (Para el listado de razas).
    ○ breed/{breed}/images/ (Para el listado de imágenes basándonos en una raza).
[]● Se solicita que su aplicación sea Single Activity y las vistas en Fragmentos.
[]● Se solicita que exista un botón que muestre el listado de favoritos.
[]● Se solicita que la referencia a la imagen favorita sea almacenada en FireStore.
[]● Utilizar librerías externas para mostrar las imágenes (Picasso, Glide).
[]● Utilizar Retrofit para la conexión a la API y Gson para el mapeo de datos.
[]● Debe utilizar Firebase(FireStore) para almacenar datos de favoritos.
[]● Para unir las vistas puedes utilizar el método que estime conveniente.(findViewById,butterknife, dataBinding)
[]● Realizar test unitarios en el presentador

 */



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}