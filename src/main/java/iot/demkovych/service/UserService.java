package iot.demkovych.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import iot.demkovych.domain.User;
import iot.demkovych.repository.UserRepository;

@AllArgsConstructor
@Service
public class UserService extends AbstractService<User, Integer> {
    public UserRepository userRepository;

    @Override
    protected JpaRepository<User, Integer> getRepository() {
        return userRepository;
    }
}
