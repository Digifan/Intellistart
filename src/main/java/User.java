

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class User {

    //static int id;
    String firstName, lastName;
    float moneyAmount;

    public static User addNewUser(String fstName, String lstName, float moneySum) {

        User newUser = new User();
        newUser.setFirstName(fstName);
        newUser.setLastName(lstName);
        newUser.setMoneyAmount(moneySum);
        //newUser.setId(newUser.hashCode());

        return newUser;
    }
}
