package tacos.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;
import tacos.entities.Taco;

@Repository
public interface TacoRepository extends R2dbcRepository<Taco, Long> {
}
