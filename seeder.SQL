USE adlister_db;

INSERT INTO users (username, email, password)
VALUES ('testerUser', 'testing@codeup.com', 'codeup');


INSERT INTO concert (userId, title, description)
VALUES (1,'Tester Show', 'come rock out with tester user');

INSERT INTO location (user_id, title, description)
VALUES (1,'Rock Box', 'address of rock box');
