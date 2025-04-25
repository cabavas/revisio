package tech.vascon.revisio.core.usecases;

import tech.vascon.revisio.core.entities.Subject;
import tech.vascon.revisio.core.enums.Category;
import tech.vascon.revisio.core.enums.Priority;

import java.time.LocalDateTime;
import java.util.List;

public class FindSubjectCaseImpl implements FindSubjectCase {
    @Override
    public Subject byId(Long id) {
        return null;
    }

    @Override
    public List<Subject> byCategory(Category category) {
        return List.of();
    }

    @Override
    public List<Subject> byPriority(Priority priority) {
        return List.of();
    }

    @Override
    public List<Subject> byTotalElapsedMinutes(Integer minutes) {
        return List.of();
    }

    @Override
    public List<Subject> byTimeAllocatedMinutes(Integer minutes) {
        return List.of();
    }

    @Override
    public List<Subject> byLastStudiedAt(LocalDateTime date) {
        return List.of();
    }

    @Override
    public List<Subject> byNextReviewDate(LocalDateTime date) {
        return List.of();
    }
}
