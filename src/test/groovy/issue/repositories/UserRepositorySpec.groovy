package issue.repositories

import io.micronaut.test.annotation.MicronautTest
import issue.domain.User
import spock.lang.Specification

import javax.inject.Inject
import javax.validation.ConstraintViolationException

@MicronautTest
class UserRepositorySpec extends Specification {

    @Inject
    UserRepository userRepository

    void "should throw a constraint violation exception"() {
        when:
        userRepository.save(new User(username: 'lt10char'))

        then:
        def ex = thrown(ConstraintViolationException)
        ex.message == 'save.entity.username: size must be between 10 and 50'
    }
}
