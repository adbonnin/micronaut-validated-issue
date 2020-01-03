package issue.repositories

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import io.micronaut.validation.Validated
import issue.domain.User

//@Validated
@JdbcRepository(dialect = Dialect.H2)
interface UserRepository extends CrudRepository<User, Integer> {

}
