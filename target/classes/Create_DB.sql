DROP TABLE IF EXISTS bonboard.comments;
DROP TABLE IF EXISTS bonboard.posts;
DROP TABLE IF EXISTS bonboard.authorities;




DROP TABLE IF EXISTS bonboard.users;


DROP TABLE IF EXISTS bonboard.tipo_post;


create table bonboard.users(
      username varchar(50) not null primary key,
      password varchar(50) not null,
      enabled boolean not null,
      email varchar(50) not null,
      fname varchar(50) not null,
      lname varchar(50) not null,
	  gender ENUM('M', 'F'));
create unique index ix_user_username on bonboard.users (username);

INSERT INTO bonboard.users VALUES('admin','admin',true,'aa@bbn.it','admin','ruotolo', 'M');
INSERT INTO bonboard.users VALUES('user','user',true,'uu@bbn.it','usero','usurante', 'M');
      
create table bonboard.authorities (
      id_auth int not null primary key AUTO_INCREMENT,  
      username varchar(50) not null,
      authority varchar(50) not null,
      constraint fk_authorities_users foreign key(username) references bonboard.users(username) ON DELETE CASCADE);
create unique index ix_auth_username on bonboard.authorities (username,authority);

INSERT INTO bonboard.authorities (username , authority) VALUES ('admin','ROLE_ADMIN');
INSERT INTO bonboard.authorities (username , authority) VALUES ('user','ROLE_USER');

create table bonboard.tipo_post (
        id_tipo int not null primary key,
        tipo varchar(50) not null);

INSERT INTO bonboard.tipo_post VALUES (1,'blog'),(2,'offerta'),(3,'pres');

create table bonboard.posts (
        id_post int not null primary key AUTO_INCREMENT,
        id_tipo int not null references tipo_post(id_tipo),
        titolo_ita varchar(50) not null,
        titolo_en varchar(50),
        body_ita varchar(8192) not null,
        body_en varchar(8192),
        username varchar(50) not null references users(username),
        time DATETIME not null);
        
INSERT INTO bonboard.posts VALUES (1,1,'primo','first','testo ita testo ita testo ita testo ita testo ita testo ita','body eng body eng body eng body eng body eng body eng ','admin',CURDATE()),
(2,1,'secondo','second','testo ita testo ita testo ita testo ita testo ita testo ita','body eng body eng body eng body eng body eng body eng ','admin',CURDATE()),
(3,1,'terzo','third','testo ita testo ita testo ita testo ita testo ita testo ita','body eng body eng body eng body eng body eng body eng ','admin',CURDATE()),
(4,1,'quarto','fouth','testo ita testo ita testo ita testo ita testo ita testo ita','body eng body eng body eng body eng body eng body eng ','admin',CURDATE());

CREATE INDEX ten_posts ON bonboard.posts (id_tipo, time DESC);
        
ALTER TABLE bonboard.posts ADD CONSTRAINT fk_username FOREIGN KEY (username) references users (username);
ALTER TABLE bonboard.posts ADD CONSTRAINT fk_tipo_posts FOREIGN KEY (id_tipo) references tipo_post (id_tipo);

create table bonboard.comments(
        id_comment int not null primary key AUTO_INCREMENT,
        id_post int not null references posts(id_post),
        username varchar(50) not null references users(username),
        body varchar(8192) not null,
        time DATETIME not null);

INSERT INTO bonboard.comments VALUES (1,1,'admin','stai forte!',CURDATE()),
(2,1,'admin','stai forte!',CURDATE()),
(3,1,'admin','stai forte!',CURDATE()),
(4,1,'admin','stai forte!',CURDATE()),
(5,2,'admin','stai forte!',CURDATE()),
(6,3,'admin','stai forte!',CURDATE()),
(7,1,'admin','stai forte!',CURDATE()),
(8,4,'admin','stai forte!',CURDATE()),
(9,4,'admin','stai forte!',CURDATE()),
(10,4,'admin','stai forte!',CURDATE());

        
CREATE INDEX comments_ind ON bonboard.comments (id_post,time DESC);
        
ALTER TABLE bonboard.comments ADD CONSTRAINT fk_usernamec FOREIGN KEY (username) references users (username);
ALTER TABLE bonboard.comments ADD CONSTRAINT fk_postc FOREIGN KEY (id_post) references posts(id_post);
