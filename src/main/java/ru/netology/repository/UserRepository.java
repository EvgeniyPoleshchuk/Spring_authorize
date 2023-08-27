package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.User;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private static Map<User,List<Authorities>> map;

    public UserRepository(){
        map = new ConcurrentHashMap<>();
        map.put(new User("ivan","123"), List.of(Authorities.DELETE,Authorities.READ,Authorities.WRITE));
        map.put(new User("Petya","1111"), List.of(Authorities.WRITE));
    }
    public List<Authorities> getUserAuthorities(String user, String password) {
        return map.get(new User(user,password));
    }
}
