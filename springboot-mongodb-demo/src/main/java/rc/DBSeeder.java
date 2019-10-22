package rc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {
    private  HotelRepository hotelRepository;
    DBSeeder(HotelRepository hotelRepository)
    {
        this.hotelRepository= hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("Pune","India");
        List reviews = Arrays.asList(new Review("aaa",8, true),
        new Review("bbb",7, false));
        Hotel mariot = new Hotel("Mariot", 130, address,reviews);
        Hotel travelodge = new Hotel("Travelodge",120, new Address("USA","NY"), Arrays.asList(new Review("abcd",9,true))) ;
        Hotel venetion = new Hotel("Vanation",220, new Address("ROME","ITALI"), Arrays.asList(new Review("xx",9,true))) ;
        this.hotelRepository.deleteAll();;
        List<Hotel> hotels = Arrays.asList(mariot,travelodge,venetion);
        hotelRepository.saveAll(hotels);
    }
}
