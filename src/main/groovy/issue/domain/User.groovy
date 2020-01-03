package issue.domain

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@MappedEntity
class User {

    @Id
    @GeneratedValue
    Long id

    @NotNull
    @Size(min = 10, max = 50)
    String username
}
