package co.com.services.utils.resources;


import co.com.services.utils.constants.EndPoints;

public enum WebServiceEndPoints {

    URI(EndPoints.URL_USER);

    private final String url;

    WebServiceEndPoints(String url){
        this.url =url;
    }

    public String getUrl(){
        return url;
    }

}