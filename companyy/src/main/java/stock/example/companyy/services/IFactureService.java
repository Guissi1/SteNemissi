package stock.example.companyy.services;

import stock.example.companyy.entities.facture;
import stock.example.companyy.entities.provider;

import java.util.List;
import java.util.Optional;

public interface IFactureService {
    Optional<facture> getfactureById(int    id);

    facture createfacture(facture facture);

    facture updatefacture(facture facture);

    void deletefacture(int id);

    List<facture> getAllfactures();
}
