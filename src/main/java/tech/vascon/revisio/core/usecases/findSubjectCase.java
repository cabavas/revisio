package tech.vascon.revisio.core.usecases;

import tech.vascon.revisio.core.entities.Subject;
import tech.vascon.revisio.core.enums.Category;
import tech.vascon.revisio.core.enums.Priority;

import java.time.LocalDateTime;
import java.util.List;

public interface FindSubjectCase {
    public Subject byId(Long id);
    public List<Subject> byCategory(Category category);
    public List<Subject> byPriority(Priority priority);
    public List<Subject> byTotalElapsedMinutes(Integer minutes);
    public List<Subject> byTimeAllocatedMinutes(Integer minutes);
    public List<Subject> byLastStudiedAt(LocalDateTime date);
    public List<Subject> byNextReviewDate(LocalDateTime date);
}
