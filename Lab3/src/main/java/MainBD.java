import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class MainBD {
    public static void main(String[] args) {

        Properties props=new Properties();
        try {
            props.load(new FileReader("bd.config"));
        } catch (IOException e) {
            System.out.println("Cannot find bd.config "+e);
        }

        CarRepository carRepo=new CarsDBRepository(props);
        carRepo.add(new Car("Mercedes","S class", 2012));
        System.out.println("Toate masinile din db");
        for(Car car:carRepo.findAll())
            System.out.println(car);
        String manufacturer="Tesla";
        carRepo.update(11,new Car("Dacia","X", 2024));
        System.out.println("Am modificat o Tesla cu Dacia.");
        System.out.println("Masinile produse de "+manufacturer);
        for(Car car:carRepo.findByManufacturer(manufacturer))
            System.out.println(car);
        System.out.println("Masinile produse intre anii 2024 si 2025");
        for(Car car:carRepo.findBetweenYears(2024,2025))
            System.out.println(car);

    }
}
