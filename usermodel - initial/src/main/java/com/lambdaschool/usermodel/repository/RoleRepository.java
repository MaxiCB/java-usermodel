package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>
{
    Role findByNameIgnoreCase(String name);
}
