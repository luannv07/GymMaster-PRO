package id.luannv.gymmaster.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "AUDIT_LOG")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "LOG_ID", nullable = false, unique = true)
    UUID logId;

    @Column(name = "EVENT_TIME", nullable = false)
    LocalDateTime eventTime;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    Member user;

    @Column(name = "EVENT_TYPE", length = 100, nullable = false)
    String eventType;

    @Column(name = "DESCRIPTION", columnDefinition = "TEXT", nullable = false)
    String description;

    @Column(name = "ENTITY_ID")
    UUID entityId;

    @Column(name = "ENTITY_TYPE", length = 50)
    String entityType;

    @Column(name = "IP_ADDRESS", length = 45)
    String ipAddress;
}
