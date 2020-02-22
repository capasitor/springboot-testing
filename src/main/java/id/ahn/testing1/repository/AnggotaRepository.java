package id.ahn.testing1.repository;

import id.ahn.testing1.domain.Anggota;
import org.springframework.data.repository.CrudRepository;

public interface AnggotaRepository extends CrudRepository<Anggota, String> {
}
