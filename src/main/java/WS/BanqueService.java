package WS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConvertionEuroToDh")
    public double converstion(@WebParam(name = "montant") double mt){
        return mt*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int Code){
        return new Compte(Code,Math.random()*60000,new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1,Math.random()*60000,new Date()),
                new Compte(2,Math.random()*60000,new Date()),
                new Compte(3,Math.random()*60000,new Date())
        );
    }
}
