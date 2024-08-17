package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utils.WebServices;

import java.util.List;

public class WebServicesSteps {

    WebServices webServices = new WebServices();
    Response response;
    List<Object> departments;

    @Then("Realizo consulta de WebService ML")
    public void realizoConsultaDeWebServiceML() {
        response = webServices.getRequest("https://www.mercadolibre.com.ar/menu/departments");


        // Verifica si hay elementos en 'departments'

    }

    @When("El codigo de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int codigo) {
        Assert.assertEquals(response.getStatusCode(),codigo);
    }

    @Then("La respuesta devuelve al menos un departamento")
    public void laRespuestaDevuelveAlMenosUnDepartamento() {
        JsonPath jsonPath = response.jsonPath();
        departments = jsonPath.getList("departments");
        if (departments != null && !departments.isEmpty()) {
            System.out.println("Existen " + departments.size() + " departamentos.");
        } else {
            System.out.println("No se encontraron departamentos.");
            Assert.fail();
        }
    }
}
