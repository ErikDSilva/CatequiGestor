package joseph.catechesis.CatequiGestor.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import joseph.catechesis.CatequiGestor.models.catechizing.Catechizing;

@Entity
@Table(name = "catechumensAttendance")
public class CatechumensAttendance {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Boolean presence;
    private String justification;

    @ManyToOne
    @JoinColumn(name = "catechizing_id", nullable = false)
    private Catechizing catechizing;

}
