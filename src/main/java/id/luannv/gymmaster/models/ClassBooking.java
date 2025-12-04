package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "CLASS_BOOKING")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClassBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "BOOKING_ID", nullable = false, unique = true)
    UUID bookingId;

    @ManyToOne
    @JoinColumn(name = "SESSION_ID", nullable = false)
    ClassSession session;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", nullable = false)
    Member member;

    @Column(name = "STATUS", length = 20, nullable = false)
    String status;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    LocalDateTime createdAt;
}
