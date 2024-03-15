package pue.edu.notesrestapi.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import pue.edu.notesrestapi.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
