package stock.example.companyy.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Document(collection = "factures")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class facture {
    @Id
    private Integer id;
    private String productId;
    private String companyName;
    private String productName;
    private String providerId;
    private int quantity;
    private double totalPrice;
    private String date;
}
