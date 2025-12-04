package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "SALE_ITEM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaleItem {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "SALE_ITEM_ID", nullable = false, unique = true)
    UUID saleItemId;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID", nullable = false)
    SaleOrder order;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    Product product;

    @Column(name = "QUANTITY", nullable = false)
    Integer quantity;

    @Column(name = "UNIT_PRICE", nullable = false)
    Double unitPrice;
}
