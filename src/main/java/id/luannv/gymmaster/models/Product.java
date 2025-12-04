package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "PRODUCT_ID", nullable = false, unique = true)
    UUID productId;

    @Column(name = "NAME", length = 100, nullable = false)
    String name;

    @Column(name = "CATEGORY", length = 50)
    String category;

    @Column(name = "PRICE", nullable = false)
    Double price;

    @Column(name = "IN_STOCK", nullable = false)
    Integer inStock;

    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
    String description;

    @Column(name = "DELETED", nullable = false)
    Boolean deleted = false;
}
