package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "MEMBER_MEMBERSHIP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MemberMembership {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "MEMBERSHIP_ID", nullable = false, unique = true)
    UUID membershipId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID", nullable = false)
    Member member;

    @ManyToOne
    @JoinColumn(name = "PLAN_ID", nullable = false)
    MembershipPlan plan;

    @Column(name = "START_DATE", nullable = false)
    LocalDate startDate;

    @Column(name = "END_DATE", nullable = false)
    LocalDate endDate;

    @Column(name = "STATUS", length = 20, nullable = false)
    String status;

    @Column(name = "FROZEN_UNTIL")
    LocalDate frozenUntil;

    @Column(name = "REMAINING_SESSIONS")
    Integer remainingSessions;

    @CreationTimestamp
    @Column(name = "CREATED_AT", nullable = false)
    LocalDateTime createdAt;
}
