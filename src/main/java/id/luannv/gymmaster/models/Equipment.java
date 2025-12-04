package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "EQUIPMENT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "EQUIPMENT_ID", nullable = false, unique = true)
    UUID equipmentId;

    @Column(name = "NAME", length = 100, nullable = false)
    String name;

    @Column(name = "CATEGORY", length = 50)
    String category;

    @Column(name = "STATUS", length = 20, nullable = false)
    String status;

    @Column(name = "LOCATION", length = 100)
    String location;

    @Column(name = "LAST_CHECKED")
    LocalDateTime lastChecked;

    @Column(name = "NOTES", columnDefinition = "TEXT")
    String notes;
}
