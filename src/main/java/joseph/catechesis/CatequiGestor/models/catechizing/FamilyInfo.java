package joseph.catechesis.CatequiGestor.models.catechizing;

import jakarta.persistence.Embeddable;
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
public class FamilyInfo {
    private String nameFather;
    private String nameMother;
    private String phoneNumber;
}
