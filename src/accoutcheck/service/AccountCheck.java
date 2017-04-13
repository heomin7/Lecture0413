package accoutcheck.service;

import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class AccountCheck implements IAcccountCheck{

    @Override
    public boolean checkAccountInfo(Map<String, String> map, String id, String password) {

        if (!map.containsKey(id)) {
            System.out.println("not valued input, re input ");
            return true;
        } else {
            if (!(map.get(id).equals(password))) {
                System.out.println("not matching password");
            } else {
                System.out.println("matching!!!");
            }
            return false;
        }
    }
}
