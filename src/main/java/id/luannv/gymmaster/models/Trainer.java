package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "TRAINER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "TRAINER_ID", nullable = false, unique = true)
    UUID trainerId;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    String firstName;

    @Column(name = "LAST_NAME", length = 50, nullable = false)
    String lastName;

    @Column(name = "EMAIL", length = 100, nullable = false, unique = true)
    String email;

    @Column(name = "PHONE", length = 20)
    String phone;

    @Column(name = "CERTIFICATION", columnDefinition = "TEXT")
    String certification;

    @Column(name = "BIO", columnDefinition = "TEXT")
    String bio;

    @Column(name = "DELETED", nullable = false)
    Boolean deleted = false;
}
