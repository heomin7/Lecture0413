package accoutcheck.service;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public interface IAcccountCheck {

    boolean checkAccountInfo(Map<String, String> map, String id, String password);

}
