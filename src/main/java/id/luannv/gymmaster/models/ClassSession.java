package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "CLASS_SESSION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClassSession {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "SESSION_ID", nullable = false, unique = true)
    UUID sessionId;

    @ManyToOne
    @JoinColumn(name = "CLASS_ID", nullable = false)
    ClassType classType;

    @ManyToOne
    @JoinColumn(name = "INSTRUCTOR_ID", nullable = false)
    Trainer instructor;

    @Column(name = "SESSION_TIME", nullable = false)
    LocalDateTime sessionTime;

    @Column(name = "DURATION_MIN", nullable = false)
    Integer durationMin;

    @Column(name = "CAPACITY", nullable = false)
    Integer capacity;

    @Column(name = "BOOKED_COUNT", nullable = false)
    Integer bookedCount = 0;

    @Column(name = "STATUS", length = 20, nullable = false)
    String status;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    LocalDateTime createdAt;
}
