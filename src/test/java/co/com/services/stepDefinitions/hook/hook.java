package co.com.services.stepDefinitions.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class hook {

    private EnvironmentVariables environmentVariables;

    @Before
    public void configureBaseUrl() {
        setTheStage(new OnlineCast());
        theActorCalled("Actor");
        String theRestApiBaseUrl = environmentVariables.optionalProperty("environment.qa.base.url").orElse("environment.qa.base.url");
        theActorInTheSpotlight().whoCan(CallAnApi.at(theRestApiBaseUrl));
    }
}