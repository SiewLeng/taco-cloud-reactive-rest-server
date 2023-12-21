CREATE TABLE IF NOT EXISTS countries (
    id int NOT NULL,
    name varchar(25) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ingredients (
    id bigint NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    type varchar(25) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tacos (
    id bigint  NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tacos_ingredients (
    id bigint  NOT NULL AUTO_INCREMENT,
    taco_id bigint NOT NULL,
    ingredient_id bigint NOT NULL,
    PRIMARY KEY (id)
);