package com.groupeisi.repository;

import com.groupeisi.entity.Historique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface HistoriqueRepository  extends JpaRepository<Historique, Long> {

    List<Historique> findAll();

    Historique save(Historique historique);
    Optional<Historique> findById(Long id);
}
