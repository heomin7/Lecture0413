package majorleague2.service;

import majorleague2.model.Park;

import java.util.List;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public interface IParkService {

    int NotUsCountry(Map<String, Park> list);  //바디가 없는 추상 메소드, 원래 abstract가 붙지만, 기본적으로 인터페이스 메소드는 abstract이므로 생략가능
    int NickNameCount(Map<String, Park> parkList);
    double ParkNameAverage(Map<String, Park> parkList);


}
