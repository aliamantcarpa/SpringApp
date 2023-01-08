package root.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import root.controllers.User;

import java.util.ArrayList;

@Service
class UserDetailsServiceImpl implements UserDetailsService {
    /*
        @Autowired
        private UserRepository userRepository;
      */
    private ArrayList<User> users = new ArrayList<User>();


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    private User findUser(String username){
        users.add(new User("Ivan", encoder.encode("pass"), "USER"));
        users.add(new User("Petr", "pass2", "USER"));
        for (User user :users) {
            if(username.equals(user.getUsername())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //    User user = userRepository.findUserByUsername(username).get();

        User user = findUser(username);
        return new UserDetailsImpl(user);
    }

}
