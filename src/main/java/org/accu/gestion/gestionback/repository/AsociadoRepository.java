package org.accu.gestion.gestionback.repository;

import org.accu.gestion.gestionback.model.Asociado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsociadoRepository extends MongoRepository<Asociado, String> {
}
