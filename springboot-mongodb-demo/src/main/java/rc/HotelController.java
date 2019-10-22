package rc;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private HotelRepository hotelRepository;
    HotelController(HotelRepository hotelRepository)
    {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/showAll")
    public List<Hotel> getAll()
    {
        List<Hotel> hotelList = this.hotelRepository.findAll();
        return hotelList;
    }

    @PutMapping("/add")
    public void insert(@RequestBody Hotel hotel)
    {
        this.hotelRepository.insert(hotel);
    }
    @PutMapping("/update")
    public void update(@RequestBody Hotel hotel)
    {
        this.hotelRepository.save(hotel);
    }

  /*  @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id)
    {
        this.hotelRepository.delete(id);
    }*/
}