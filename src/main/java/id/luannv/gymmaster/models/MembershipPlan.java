package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "MEMBERSHIP_PLAN")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MembershipPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "PLAN_ID", nullable = false, unique = true)
    UUID planId;

    @Column(name = "NAME", length = 100, nullable = false)
    String name;

    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
    String description;

    @Column(name = "DURATION_DAYS", nullable = false)
    Integer durationDays;

    @Column(name = "PRICE", nullable = false)
    Double price;

    @Column(name = "MAX_VISITS")
    Integer maxVisits;

    @Column(name = "CATEGORY", length = 50)
    String category;
}
