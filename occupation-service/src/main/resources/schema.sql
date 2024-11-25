CREATE SCHEMA IF NOT EXISTS career;

CREATE TABLE IF NOT EXISTS career.occupation (
    id NUMERIC(3) NOT NULL  PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description  VARCHAR(255),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL
);