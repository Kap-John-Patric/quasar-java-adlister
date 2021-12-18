USE adlister_db;

INSERT INTO users (username, email, password)
VALUES ('testerUser', 'testing@codeup.com', 'codeup');

INSERT INTO artist (id, user_id, username, firstName, lastName, email, password, group_name)
VALUES (1, 2, 'JustDave','Dave','Mickey','DM@gmail.com', 123, 'JustDave');

INSERT INTO concert (id, user_id, group_name, title, location, date, price)
VALUES (1, 2, 'group','Tester', 'Texas', 20211225, 50.00);

INSERT INTO location (user_id, title, description)
VALUES (2,'Rock Box', 'address of rock box');
