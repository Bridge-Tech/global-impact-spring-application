CREATE TABLE person(
	id INT PRIMARY KEY auto_increment,
	number INT,
	user VARCHAR(100),
	cpf VARCHAR(14),
	fullAddress VARCHAR(500),
	name VARCHAR(100),
	address VARCHAR(200),
	complement VARCHAR(100),
	district VARCHAR(200),
	password VARCHAR(80)
	
);

INSERT INTO person (number, user, cpf, fullAddress, name, address, complement, district, password) VALUES(20,'Crocha','xxxxxxxxxxxxxx','R. Candido Lacerda - JD Paulista - N 20 - APTO 02', 'Caio Rocha','R. Candido Lacerda','APTO 02', 'JD Paulista','123456789');



CREATE TABLE ong(
	id INT PRIMARY KEY auto_increment,
	number INT,
	user VARCHAR(100),
	cnpj VARCHAR(14),
	fullAddress VARCHAR(500),
	name VARCHAR(100),
	address VARCHAR(200),
	complement VARCHAR(100),
	district VARCHAR(200),
	password VARCHAR(80)
	
);

INSERT INTO ong (number, user, cnpj, fullAddress, name, address, complement, district, password) VALUES(100,'NossoCaminho','xxxxxxxxxxxxxx','R.João Mendes - JD Acapuco - N 100 ', 'Nosso Caminho','R. João Mendes','APTO 02', 'JD Acapuco','987654321');



CREATE TABLE role(
	id INT PRIMARY KEY auto_increment,
  	name VARCHAR(60) NOT NULL,
  	description VARCHAR(200) NOT NULL

);

INSERT INTO role (name, description) VALUES('ROLE_ONG','Permissão de ONG'),
('ROLE_DONOR','Permissão de Doador');

CREATE TABLE person_roles(
	person_id INT,
	roles_id INT
);

INSERT INTO person_roles VALUES(1,2);
