import proxy.BanqueService;
import proxy.BanqueServiceService;

public class Client {
    public static void main(String[] args) {
        BanqueService stub=new BanqueServiceService().getBanqueServicePort();
        System.out.println(stub.conversion(7600));
    }
}
