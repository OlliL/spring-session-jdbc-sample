package net.salatschuessel.sample;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final HttpSession session;
    private final JdbcRepository repository;

    @Autowired
    public Controller(JdbcRepository repository, HttpSession session) {
        this.repository = repository;
        this.session = session;
    }

    @PostMapping("/test")
    @Transactional(propagation = Propagation.REQUIRED)
    public String test() {
        repository.insert(1);
        session.setAttribute("test", "test");
        return repository.countAll().toString()+"\n";
    }
}
