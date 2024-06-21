package WS;

import jakarta.xml.ws.Endpoint;

public class ServerJaxWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:8484/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service deployed in "+url);
    }
}
