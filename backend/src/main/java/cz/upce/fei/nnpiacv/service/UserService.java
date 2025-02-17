package cz.upce.fei.nnpiacv.service;

import cz.upce.fei.nnpiacv.domain.User;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    private final HashMap<Long, User> users = new HashMap<>();

    @PostConstruct
    public void init() {
        User user1 = new User(0L, "example1@example.cz", "password");
        User user2 = new User(1L, "example2@email.cz", "strongpassword");
        users.put(user1.getId(), user1);
        users.put(user2.getId(), user2);
    }

    public String findUser(long id) {
        log.debug("User requested: {}", users.get(id).toString());
        return users.get(id).toString();
    }

    public Collection<User> findUsers() {
        log.debug("All users requested.");
        return users.values();
    }
}
