package stock.example.companyy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import stock.example.companyy.entities.facture;

public interface factureRepository extends MongoRepository<facture, Integer> {
}


/*package stock.example.companyy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import stock.example.companyy.entities.facture;

public interface factureRepository extends MongoRepository<facture, Integer> {
}*/
