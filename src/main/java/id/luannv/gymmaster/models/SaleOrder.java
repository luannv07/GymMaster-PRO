package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "SALE_ORDER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaleOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ORDER_ID", nullable = false, unique = true)
    UUID orderId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    Member member;

    @Column(name = "ORDER_TIME", nullable = false)
    LocalDateTime orderTime;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    Double totalAmount;

    @Column(name = "PAYMENT_METHOD", length = 20, nullable = false)
    String paymentMethod;
}
