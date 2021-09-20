package ec.edu.utpl.pintegrativa.semana11.nlp;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class TransformT2E {
    public static void main(String[] args) throws UnsupportedEncodingException, UnirestException {
        String mensaje = """
                El 8 de diciembre, Loja celebra 472 años de fundación, en este marco el Municipio de Loja realizó la colocación de ofrendas en el monumento al Capitán Alonso de Mercadillo, ubicado en la plaza San Francisco.
                Con civismo se desarrolló este acto, en donde elementos del Cuerpo de Bomberos y Agentes de Control Municipal realizaron el marco de honor. Con el ingreso de la bandera se inició el programa.
                Jeremy Maita, alumno de la escuela municipal Ecológica, ofreció la conferencia alusiva a la fecha, destacando las dos fundaciones de Loja.  La primera que se realizó en 1546 en el valle de Garrochamba y la segunda el 8 de diciembre de 1548, en el valle de Cuxibamba, a cargo del capitán Alonso de Mercadillo con el nombre de Inmaculada Concepción de Loja.
                Loja fue considerada como fortaleza porque desde este lugar partieron los conquistadores hacia nuevos rumbos. “Son 472 años de esta bella ciudad que nos desafía a diario, tierra de artistas, intelectuales, gente genuina que ama y defiende su cultura”, enfatizó el niño Jeremy Maita.
                Un total de trece ofrendas se ubicaron, que corresponde a la Fundación Cívica San Sebastián, Banco del Ecuador, Universidad Nacional, Universidad Técnica, Celec, Consejo Nacional Electoral, Corte Nacional de Justicia, Policía Nacional, Ejército, Consulado del Perú, Prefectura, Gobernación y Municipio de Loja.
                """;
        String msjEncoded = URLEncoder.encode(mensaje, "UTF-8");
        HttpResponse<String> response =
                Unirest.post("http://api.meaningcloud.com/topics-2.0")
                .header("content-type", "application/x-www-form-urlencoded")
                .body("key=fb89a9abba8a418156fd0d219e1f3753&lang=es&txt="+msjEncoded+"&tt=ectmn")
                .asString();
        System.out.println(response.getBody());
    }
}
