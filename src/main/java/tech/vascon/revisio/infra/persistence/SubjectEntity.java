package tech.vascon.revisio.infra.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.vascon.revisio.core.enums.Category;
import tech.vascon.revisio.core.enums.Priority;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "subject")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "subject_categories", joinColumns = @JoinColumn(name = "subject_id"))
    @Column(name = "category")
    private List<Category> categories;

    private String description;

    @Column(name = "target_mastery_level")
    private Integer targetMasteryLevel;

    @Column(name = "current_mastery_level")
    private Integer currentMasteryLevel;

    @Column(name = "time_allocated_minutes")
    private Integer timeAllocatedMinutes;

    @Column(name = "total_elapsed_minutes")
    private Integer totalElapsedMinutes;

    @Column(name = "last_studied_at")
    private LocalDateTime lastStudiedAt;

    @Column(name = "next_review_date")
    private LocalDateTime nextReviewDate;

    @ElementCollection
    @CollectionTable(name = "subject_notes", joinColumns = @JoinColumn(name = "subject_id"))
    @Column(name = "note")
    private List<String> notes;

    @Column(name = "priority_level")
    @Enumerated(EnumType.STRING)
    private Priority priorityLevel;

    @ElementCollection
    @CollectionTable(name = "subject_reference_materials", joinColumns = @JoinColumn(name = "subject_id"))
    @Column(name = "reference_material")
    private List<String> referenceMaterials;
}
