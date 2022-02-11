package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{

    public List<Car> getCarsList(Integer count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("model1", "series1", "country1"));
        carList.add(new Car("model2", "series2", "country2"));
        carList.add(new Car("model3", "series3", "country3"));
        carList.add(new Car("model4", "series4", "country4"));
        carList.add(new Car("model5", "series5", "country5"));

        if ((count == null) || (count > 5)) {
            count = 5;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
