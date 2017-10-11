CREATE TABLE users (id int PRIMARY KEY AUTO_INCREMENT, username varchar(50),
  password varchar(50), created_at datetime, modified_at timestamp);

CREATE TABLE images(id int PRIMARY KEY AUTO_INCREMENT, filePath varchar(300),
  size int, created_at datetime, modified_at timestamp);

CREATE TABLE decks(id int PRIMARY KEY AUTO_INCREMENT, image_id int, owner_id int,
  created_at datetime, modified_at timestamp);

CREATE TABLE cards(id int PRIMARY KEY AUTO_INCREMENT, name varchar(50));

