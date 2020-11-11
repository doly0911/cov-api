package co.edu.udea.covapi.populator;

import co.edu.udea.covapi.dto.UserRequestDTO;
import co.edu.udea.covapi.dto.UserResponseDTO;
import co.edu.udea.covapi.model.Role;
import co.edu.udea.covapi.model.User;
import co.edu.udea.covapi.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

@Component
public class UserPopulator implements Populator<User, UserResponseDTO, UserRequestDTO> {

    @Autowired
    private RoleService roleService;

    @Override
    public void populate(User source, UserResponseDTO target) throws ExecutionException, InterruptedException {
        target.setName(source.getName());
        target.setAge(source.getAge());
        target.setRole(source.getRole().get().get().toObject(Role.class));
        target.setId(source.getModelId());
    }

    @Override
    public void inverselyPopulate(UserRequestDTO source, User target) throws ExecutionException, InterruptedException {
        target.setName(source.getName());
        target.setAge(source.getAge());
        target.setEmail(source.getEmail());
        target.setRole(roleService.getReference(source.getRoleId()));
    }
}
