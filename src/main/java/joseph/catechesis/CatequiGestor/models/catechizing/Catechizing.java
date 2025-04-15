package joseph.catechesis.CatequiGestor.models.catechizing;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "catechizing")
public class Catechizing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate dateOfBirth;

    @Embedded
    private AddressCatechizing addressCatechizing;

    @Embedded
    private FamilyInfo familyInfo;

    @Embedded
    private SacramentalStatus sacramentalStatus;

    @Embedded
    private PersonalStatus personalStatus;
}
