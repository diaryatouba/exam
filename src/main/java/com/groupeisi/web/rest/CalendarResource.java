package com.groupeisi.web.rest;

import com.groupeisi.service.HistoriqueService;
import com.groupeisi.service.dto.HistoriqueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CalendarResource {
    @Autowired
    private HistoriqueService historiqueService;

    @GetMapping("/all")
    public List<HistoriqueDTO> getAllHistoriques() {
        return historiqueService.getAllHistoriques();
    }

    @GetMapping("/services/calendar/dayfinder")
    public Map<String, String> findDayOfWeek(@RequestParam("date") String dateString) {
        Map<String, String> result = new HashMap<>();

        try {
            // Convertir la chaîne de date en objet LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dateString, formatter);

            // Obtenir le jour de la semaine correspondant à la date
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            // Ajouter la date et le jour de la semaine au résultat
            result.put("date", date.toString());
            result.put("dayOfWeek", dayOfWeek.toString());
        } catch (Exception e) {
            result.put("error", "Invalid date format. Please use dd-MM-yyyy format.");
        }

        return result;
    }
}
