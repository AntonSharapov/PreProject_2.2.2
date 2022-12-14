package web.service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarSeriviceImpl implements CarService{
    public static int count;
    public static List<Car> list = new ArrayList<>();
    {
    list.add(new Car("BMW", "12", ++count));
    list.add(new Car("Audi", "13", ++count));
    list.add(new Car("KIA", "14", ++count));
    list.add(new Car("Hundai", "15", ++count));
    list.add(new Car("Lada", "16", ++count));
    }

    @Override
    public List<Car> getAlllist() {
        return list;
    }

    @Override
    public List<Car> getByID(int id) {
//        List<Car> list2 = new ArrayList<>();
//        if(id <= 5) {
//            for (int e = 0; e < id; e++) {
//                list2.add(list.get(e));
//            }
//            return list2;
//        }
//        else {
//            return list;
//        }
        return list.stream().limit(id).collect(Collectors.toList());
    }
}
