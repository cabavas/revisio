package tech.vascon.revisio.core.usecases;

import tech.vascon.revisio.core.entities.Subject;

public interface CreateSubjectCase {
    public Subject execute(Subject subject);
}
