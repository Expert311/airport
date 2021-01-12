USE my_db_2;
#DROP TABLE pilots;
CREATE TABLE pilots (
   id INT AUTO_INCREMENT,
   first_name VARCHAR(150) NOT NULL,
   last_name VARCHAR(150) NOT NULL,
   pilot_rank VARCHAR(100) NOT NULL,
   id_pilot INT UNIQUE NOT NULL,
   PRIMARY KEY (id)
);

INSERT INTO pilots (first_name, last_name, pilot_rank, id_pilot)
VALUES ('Evgeny', 'Bylina', '4', 001);

INSERT INTO pilots (first_name, last_name, pilot_rank, id_pilot)
VALUES ('Maxim', 'Nazarov', '3', 002);

INSERT INTO pilots (first_name, last_name, pilot_rank, id_pilot)
VALUES ('Albert', 'Dawson', '4', 003);

INSERT INTO pilots (first_name, last_name, pilot_rank, id_pilot)
VALUES ('Nikita', 'Shestakov', '2', 004);

INSERT INTO pilots (first_name, last_name, pilot_rank, id_pilot)
VALUES ('Vladimir', 'Volkov', '4', 005);

#DROP TABLE planes;
CREATE TABLE planes (
   id INT AUTO_INCREMENT,
   mark VARCHAR(150) NOT NULL,
   model VARCHAR(150) NOT NULL,
   passengers_count INT NOT NULL,
   id_number INT UNIQUE NOT NULL,
   PRIMARY KEY (id)
);

INSERT INTO planes (mark, model, passengers_count, id_number)
VALUES ('Airbus', 'A330', 199, 00100);

INSERT INTO planes (mark, model, passengers_count, id_number)
VALUES ('Boeing', '737', 625, 00200);

INSERT INTO planes (mark, model, passengers_count, id_number)
VALUES ('Airbus', 'A320NEO', 226, 00300);

INSERT INTO planes (mark, model, passengers_count, id_number)
VALUES ('Boeing', '747', 325, 00400);

INSERT INTO planes (mark, model, passengers_count, id_number)
VALUES ('Boeing', '777', 912, 00500);

#DROP TABLE flights;
CREATE TABLE flights (
   id INT AUTO_INCREMENT,
   plane_id INT NOT NULL,
   pilot_id INT NOT NULL,
   flight_date DATE NOT NULL,
   flight_time TIME NOT NULL,
   flight_number INT UNIQUE NOT NULL,
   PRIMARY KEY (id),
   FOREIGN KEY (plane_id) REFERENCES planes(id_number),
   FOREIGN KEY (pilot_id) REFERENCES pilots(id_pilot)
);

INSERT INTO flights (plane_id, pilot_id, flight_date, flight_time, flight_number)
VALUES (00100, 001, '2021-02-27', '23:14', 100100);

INSERT INTO flights (plane_id, pilot_id, flight_date, flight_time, flight_number)
VALUES (00200, 002, '2021-02-20', '22:15', 100200);

INSERT INTO flights (plane_id, pilot_id, flight_date, flight_time, flight_number)
VALUES (00300, 003, '2021-02-02', '01:17', 100300);

INSERT INTO flights (plane_id, pilot_id, flight_date, flight_time, flight_number)
VALUES (00400, 004, '2021-02-17', '03:59', 100400);

INSERT INTO flights (plane_id, pilot_id, flight_date, flight_time, flight_number)
VALUES (00500, 005, '2021-02-07', '07:21', 100500);