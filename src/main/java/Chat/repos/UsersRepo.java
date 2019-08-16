package Chat.repos;

import Chat.domain.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepo extends CrudRepository<Users, Integer> {

}
