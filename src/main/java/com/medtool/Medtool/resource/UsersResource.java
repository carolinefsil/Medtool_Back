package com.medtool.Medtool.resource;


import com.medtool.Medtool.model.Authorities;
import com.medtool.Medtool.model.Users;
import com.medtool.Medtool.repository.AuthoritiesRepositoryJPA;
import com.medtool.Medtool.repository.UsersRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersResource {

    @Autowired
    private UsersRepositoryJPA repositoryUJPA;

    @Autowired
    private AuthoritiesRepositoryJPA repositoryAJPA;

    @Autowired
    private DataSource datasource;

//    @Autowired
//    private UsersServiceAPI usersService;

    @GetMapping
    public @ResponseBody
    HttpEntity<List<Users>> findAll() {

        List<Users> users = repositoryUJPA.findAll();

        if(users.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(users);
    }

    @PostMapping
    public @ResponseBody
    HttpEntity<Users> create(@RequestBody Users user) {

        PasswordEncoder encoder = new BCryptPasswordEncoder();

        user.setPassword(encoder.encode(user.getPassword()));
        user.setEnabled(true);

        Authorities autho = new Authorities();

        autho.setAuthority("USER");
        autho.setUsername(user.getUsername());

        repositoryUJPA.save(user);

        repositoryAJPA.save(autho);

        return ResponseEntity.ok(user);
    }

//    @PostMapping
//    public @ResponseBody
//    HttpEntity<Users> create(@RequestBody Users user) {
//
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//
//        JdbcUserDetailsManager userDetailsService = new JdbcUserDetailsManager();
//        userDetailsService.setDataSource(datasource);
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority("USER"));
//        User userDetails = new User(user.getUsername(),
//                encoder.encode(user.getPassword()), authorities);
//        userDetailsService.createUser(userDetails);
//        return ResponseEntity.ok(user);
//    }


    //
//    @GetMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Banda> get(@PathVariable(name = "id") Long id) {
//
//        Banda banda = bandaService.get(id);
//        return ResponseEntity.ok(banda);
//    }
//
//
//    @PutMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Banda> update(@PathVariable(name = "id") Long id,
//                             @RequestBody Banda banda) {
//
//        banda.setId(id);
//        bandaService.update(banda);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public @ResponseBody
//    HttpEntity<Banda> remove(@PathVariable(name = "id") Long id) {
//
//        bandaService.remove(id);
//        return ResponseEntity.ok().build();
//    }
}
