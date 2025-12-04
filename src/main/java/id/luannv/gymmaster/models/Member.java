package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "MEMBER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "MEMBER_ID", nullable = false, unique = true)
    UUID memberId;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    String firstName;

    @Column(name = "LAST_NAME", length = 50, nullable = false)
    String lastName;

    @Column(name = "EMAIL", length = 100, nullable = false, unique = true)
    String email;

    @Column(name = "PHONE", length = 20)
    String phone;

    @Column(name = "DATE_OF_BIRTH")
    LocalDate dateOfBirth;

    @Column(name = "ADDRESS", columnDefinition = "TEXT")
    String address;

    @Column(name = "MEMBERSHIP_STATUS", length = 20, nullable = false)
    String membershipStatus;

    @CreationTimestamp
    @Column(name = "REGISTRATION_DATE", nullable = false)
    LocalDateTime registrationDate;

    @Column(name = "DELETED", nullable = false)
    Boolean deleted = false;
}
