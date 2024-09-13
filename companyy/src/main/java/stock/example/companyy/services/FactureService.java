package stock.example.companyy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.example.companyy.entities.facture;
import stock.example.companyy.repositories.factureRepository;
import stock.example.companyy.config.AutoIncrementUtil;

import java.util.List;
import java.util.Optional;

@Service
public class FactureService {

    @Autowired
    private factureRepository factureRepository;

    @Autowired
    private AutoIncrementUtil autoIncrementUtil;

    public List<facture> getAllfactures() {
        return factureRepository.findAll();
    }

    public Optional<facture> getfactureById(int id) {
        return factureRepository.findById(id);
    }

    public facture createfacture(facture facture) {
        facture.setId(autoIncrementUtil.getNextSequence("facture_sequence"));
        return factureRepository.save(facture);
    }

    public facture updatefacture(facture facture) {
        return factureRepository.save(facture);
    }

    public void deletefacture(int id) {
        factureRepository.deleteById(id);
    }
}
