CREATE TABLE Billett(
id INTEGER AUTO_INCREMENT NOT NULL,
film VARCHAR (255) NOT null,
antall INTEGER NOT null,
fornavn VARCHAR (255) NOT null,
etternavn VARCHAR (255) NOT null,
tlf VARCHAR (255) NOT null,
epost VARCHAR (255) NOT null,
PRIMARY KEY (id)
);