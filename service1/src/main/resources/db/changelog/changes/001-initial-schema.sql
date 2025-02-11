--changeset ivanogor:1
CREATE TABLE sums (
    id BIGSERIAL PRIMARY KEY,
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    first_argument INT,
    second_argument INT,
    result INT
);