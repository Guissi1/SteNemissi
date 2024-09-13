package stock.example.companyy.config;


import stock.example.companyy.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stock.example.companyy.repositories.*;


@Component
public class DatabaseInit implements CommandLineRunner {
    private final factureRepository factureRepository;
    private final ProductRepository productRepository;
    private final providerRepository providerRepository;



    public DatabaseInit(factureRepository factureRepository, ProductRepository productRepository, providerRepository providerRepository) {
        this.factureRepository = factureRepository;
        this.productRepository = productRepository;
        this.providerRepository = providerRepository;
    }

    @Override
    public void run(String... args) {
        if (productRepository.count() == 0) {
            product product = new product();
            productRepository.save(product);
        }

        if (providerRepository.count() == 0) {
            provider provider = new provider();
            providerRepository.save(provider);
        }

        if (factureRepository.count() == 0) {
            facture facture = new facture();
            factureRepository.save(facture);
        }
    }
}

