package joseph.catechesis.CatequiGestor.models.catechizing;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import joseph.catechesis.CatequiGestor.enums.catechizing.ParticipatesInChurchMovement;
import joseph.catechesis.CatequiGestor.enums.catechizing.SpecialNeedsStatus;
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
public class PersonalStatus {
    
    @Enumerated(EnumType.STRING)
    private ParticipatesInChurchMovement participatesInChurchMovement;

    @Enumerated(EnumType.STRING)
    private SpecialNeedsStatus specialNeedsStatus;
    private String whichSpecialNeeds;

}
