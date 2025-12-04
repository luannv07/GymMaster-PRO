package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "CLASS_TYPE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClassType {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "CLASS_ID", nullable = false, unique = true)
    UUID classId;

    @Column(name = "NAME", length = 100, nullable = false)
    String name;

    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
    String description;

    @Column(name = "DEFAULT_CAPACITY")
    Integer defaultCapacity;

    @Column(name = "DELETED", nullable = false)
    Boolean deleted = false;
}
