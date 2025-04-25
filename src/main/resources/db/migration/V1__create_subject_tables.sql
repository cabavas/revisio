CREATE TABLE subject
(
    id                     BIGSERIAL PRIMARY KEY,
    name                   VARCHAR(50) NOT NULL,
    description            TEXT,
    target_mastery_level   INT,
    current_mastery_level  INT,
    time_allocated_minutes INT,
    total_elapsed_minutes  INT,
    last_studied_at        TIMESTAMP,
    next_review_date       TIMESTAMP,
    priority_level         VARCHAR(20) NOT NULL
);

CREATE TABLE subject_categories
(
    subject_id BIGINT      NOT NULL,
    category   VARCHAR(50) NOT NULL,
    PRIMARY KEY (subject_id, category),
    FOREIGN KEY (subject_id) REFERENCES subject (id) ON DELETE CASCADE
);

CREATE TABLE subject_notes
(
    subject_id BIGINT NOT NULL,
    note       TEXT,
    FOREIGN KEY (subject_id) REFERENCES subject (id) ON DELETE CASCADE
);

CREATE TABLE subject_reference_materials
(
    subject_id          BIGINT NOT NULL,
    reference_material  TEXT,
    FOREIGN KEY (subject_id) REFERENCES subject (id) ON DELETE CASCADE
);
