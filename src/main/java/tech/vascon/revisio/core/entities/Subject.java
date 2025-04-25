package tech.vascon.revisio.core.entities;

import tech.vascon.revisio.core.enums.Category;
import tech.vascon.revisio.core.enums.Priority;

import java.time.LocalDateTime;
import java.util.List;

public record Subject(
    Long id,
    String name,
    List<Category> categories,
    String description,
    Integer targetMasteryLevel,
    Integer currentMasteryLevel,
    Integer timeAllocatedMinutes,
    Integer totalElapsedMinutes,
    LocalDateTime lastStudiedAt,
    LocalDateTime nextReviewDate,
    List<String> notes,
    Priority priorityLevel,
    List<String> referenceMaterials
) {}
