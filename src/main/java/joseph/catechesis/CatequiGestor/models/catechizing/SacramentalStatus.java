package joseph.catechesis.CatequiGestor.models.catechizing;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import joseph.catechesis.CatequiGestor.enums.catechizing.BaptismStatus;
import joseph.catechesis.CatequiGestor.enums.catechizing.EucharisticCelebrationsFrequency;
import joseph.catechesis.CatequiGestor.enums.catechizing.FirstEucharistStatus;
import joseph.catechesis.CatequiGestor.enums.catechizing.ImpedimentMarrigeStatus;
import joseph.catechesis.CatequiGestor.enums.catechizing.MarriedStatus;
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
@Embeddable
public class SacramentalStatus {
    
    @Enumerated(EnumType.STRING)
    private BaptismStatus baptismStatus;
    private String whichParish;

    @Enumerated(EnumType.STRING)
    private FirstEucharistStatus firstEucharistStatus;

    @Enumerated(EnumType.STRING)
    private MarriedStatus marriedStatus;

    @Enumerated(EnumType.STRING)
    private ImpedimentMarrigeStatus impedimentMarrigeStatus;
    private String whatImpediment;

    @Enumerated(EnumType.STRING)
    private EucharisticCelebrationsFrequency eucharisticCelebrationsFrequency;

}
