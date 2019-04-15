create table if not exists books (
id int auto_increment,
reader varchar(128),
isbn varchar(128),
title varchar(128),
author varchar(128),
description varchar(128), primary key (id));


create table if not exists readers(
  username varchar(128),
  fullname varchar(128),
  password varchar(128),
  primary key (username)
);

insert into books ( reader, isbn, title, author, description)
values ('robbie', '12-45', "a book", "escoffier", 'new book for nothing');

insert into books ( reader, isbn, title, author, description)
values ('robbie', '13-75', "1 a book", "1escoffier", '1new book for nothing');

insert into readers (username, fullname, password)
values ('robbie' , "robbie qiu" , '123456');