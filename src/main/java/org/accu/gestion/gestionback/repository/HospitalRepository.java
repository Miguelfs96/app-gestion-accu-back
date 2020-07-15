package org.accu.gestion.gestionback.repository;

import org.accu.gestion.gestionback.model.hospital.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {
}
