--changeset ivanogor:2
CREATE TABLE multiplications (
    id BIGSERIAL PRIMARY KEY,
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    first_argument INT,
    second_argument INT,
    result INT
);