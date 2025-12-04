package id.luannv.gymmaster.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDate;

@Entity
@Table(
        name = "LOOKUP_VALUES",
        uniqueConstraints = @UniqueConstraint(columnNames = {"LOOKUP_CD", "LOOKUP_GROUP"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LookupValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    @Column(name = "LOOKUP_VALUE", length = 255, nullable = false)
    String lookupValue;

    @Column(name = "LOOKUP_CD", nullable = false)
    Integer lookupCd;

    @Column(name = "LOOKUP_GROUP", length = 20, nullable = false)
    String lookupGroup;

    @Column(name = "STATUS_FLG", nullable = false, columnDefinition = "Tinyint default 1")
    Integer statusFlg;

    @Column(name = "DESCRIPTION", length = 255)
    String description;

    @Column(name = "CREATED_BY", length = 30, nullable = false)
    String createdBy;

    @CreationTimestamp
    @JsonIgnore
    @Column(name = "CREATED_DATE", nullable = false)
    LocalDate createdDate;

    @Column(name = "LAST_UPDATED_BY", length = 30, nullable = false)
    String lastUpdatedBy;

    @UpdateTimestamp
    @JsonIgnore
    @Column(name = "LAST_UPDATED_DATE", nullable = false)
    LocalDate lastUpdatedDate;
}
