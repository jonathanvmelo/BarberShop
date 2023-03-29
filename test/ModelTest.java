
import br.com.barbershop.model.Client;
import br.com.barbershop.model.Schedule;
import br.com.barbershop.model.Service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class ModelTest {
    public static void main(String[] args) {
        
        Service service1 = new Service(1, "Corte normal", 50f);
        
        Client client1 = new Client(1, "João", "47998899887", "joao@gmail.com", "89010500", "Av.: Paulista, 500");
        System.out.println(client1.getName());
        
        Schedule sch = new Schedule(1, client1, service1, 0, "15/04/2023 08:45");
        System.out.println(sch.getService().getDescription());
        
    }
}
