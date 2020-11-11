package co.edu.udea.covapi.service;

import co.edu.udea.covapi.model.User;
import org.springframework.stereotype.Service;



@Service
public class DefaultUserService extends DefaultBaseModelService<User> implements UserService {

    @Override
    public String getCollectionName() {
        return "users/";

    }
}