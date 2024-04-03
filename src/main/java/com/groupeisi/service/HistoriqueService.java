package com.groupeisi.service;

import com.groupeisi.entity.Historique;
import com.groupeisi.repository.HistoriqueRepository;
import com.groupeisi.service.dto.HistoriqueDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HistoriqueService {
    List<HistoriqueDTO> getAllHistoriques();
    HistoriqueDTO createHistorique(HistoriqueRequest request);
    HistoriqueDTO getHistorique(Long id);
}

