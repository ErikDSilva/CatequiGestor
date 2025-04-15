package joseph.catechesis.CatequiGestor.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import joseph.catechesis.CatequiGestor.enums.catechesis_class.DayWeek;
import joseph.catechesis.CatequiGestor.enums.catechesis_class.SacramentClass;
import joseph.catechesis.CatequiGestor.models.catechizing.Catechizing;
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
@Table(name = "CatechesisClass")
public class CatechesisClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private SacramentClass sacramentClass;

    @Enumerated(EnumType.STRING)
    private DayWeek dayWeek;

    @OneToMany
    @JoinColumn(name = "catechist_id", nullable = false)
    private Catechist catechist;

    @OneToMany
    @JoinColumn(name = "catechizing_id", nullable = false)
    private Catechizing catechizing;
}
