
import br.com.barbershop.model.Client;
import br.com.barbershop.model.Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client(1, "João", "47998899887", "joao@gmail.com", "89010500", "Av.: Paulista, 500");
        System.out.println(client1.getName());
        
        Person pe = new Person();
    }
}
