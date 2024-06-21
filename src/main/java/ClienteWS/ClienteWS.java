package ClienteWS;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClienteWS {
    public static void main(String[] args) {
        BanqueService proxy=new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.convertionEuroToDh(75));
        Compte cp=proxy.getCompte(8);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
    }
}
