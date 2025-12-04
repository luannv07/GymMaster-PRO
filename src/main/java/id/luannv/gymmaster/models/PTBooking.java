package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "PT_BOOKING")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PTBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "BOOKING_ID", nullable = false, unique = true)
    UUID bookingId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", nullable = false)
    Member member;

    @ManyToOne
    @JoinColumn(name = "TRAINER_ID", nullable = false)
    Trainer trainer;

    @Column(name = "SCHEDULED_TIME", nullable = false)
    LocalDateTime scheduledTime;

    @Column(name = "DURATION_MIN", nullable = false)
    Integer durationMin;

    @Column(name = "STATUS", length = 20, nullable = false)
    String status;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    LocalDateTime createdAt;
}
