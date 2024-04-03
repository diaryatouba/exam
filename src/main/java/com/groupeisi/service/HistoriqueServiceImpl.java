package com.groupeisi.service;

import com.groupeisi.entity.Historique;
import com.groupeisi.repository.HistoriqueRepository;
import com.groupeisi.service.dto.HistoriqueDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class HistoriqueServiceImpl implements HistoriqueService {
    private HistoriqueRepository historiqueRepository;

    @Override
    public List<HistoriqueDTO> getAllHistoriques() {
        List<Historique> historiques = historiqueRepository.findAll();
        return historiques.stream()
            .map(this::mapToDto)
            .collect(Collectors.toList());
    }

    @Override
    public HistoriqueDTO createHistorique(HistoriqueRequest request) {
        Historique historique = new Historique();
        // Logique de création de l'objet Historique à partir de la requête
        historique = historiqueRepository.save(historique);
        return mapToDto(historique);
    }

    @Override
    public HistoriqueDTO getHistorique(Long id) {
        Object historique = historiqueRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Historique not found with id: " + id));
        return mapToDto((Historique) historique);
    }

    // Méthode pour mapper l'entité Historique à DTO HistoriqueDTO
    private HistoriqueDTO mapToDto(Historique historique) {
        HistoriqueDTO dto = new HistoriqueDTO();
        // Mapping des propriétés de l'entité Historique à DTO HistoriqueDTO
        return dto;
    }
}
