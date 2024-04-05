package co.com.services.stepDefinitions;

import co.com.services.questions.StatusCode;
import co.com.services.tasks.ConsumeGet;
import co.com.services.utils.resources.WebServiceEndPoints;
import io.cucumber.java.en.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class stepDefinition {

    @Given("Registro la informacion del usuario")
    public void registroLaInformacionDelUsuario() {

    }

    @When("Consumo el servicio de creacion")
    public void consumoElServicioDeCreacion() {
        theActorInTheSpotlight().attemptsTo(
                ConsumeGet.service(
                        WebServiceEndPoints.URI.getUrl()
                )
        );
    }

    @Then("Puedo ver el codigo de respuesta {int}")
    public void puedoVerElCodigoDeRespuesta(int responseCode) {
        theActorInTheSpotlight().should(
                seeThat(StatusCode.is(responseCode))
        );
    }
}
