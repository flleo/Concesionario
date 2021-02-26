CREATE DATABASE Concesionario;
USE Concesionario;

CREATE TABLE Marcas (
	IdMarca INT PRIMARY KEY AUTO_INCREMENT
    , Nombre VARCHAR(255) NOT NULL
    , Logo VARCHAR(255) NOT NULL
);

CREATE TABLE Modelos (
	IdModelo INT PRIMARY KEY AUTO_INCREMENT
    , IdMarca INT
    , IdTipoCoche INT
    , Nombre VARCHAR(255) NOT NULL
    , FechaLanzamiento	DATE NOT NULL
);

CREATE TABLE TiposCoche (
	IdTipoCoche INT PRIMARY KEY AUTO_INCREMENT
    , Nombre VARCHAR(255) NOT NULL
);

ALTER TABLE Modelos ADD CONSTRAINT FK_Modelos_Marcas_IdMarca FOREIGN KEY (IdMarca)
REFERENCES Marcas (IdMarca);

ALTER TABLE Modelos ADD CONSTRAINT FK_Modelos_TiposCoche_IdTipoCoche FOREIGN KEY (IdTipoCoche)
REFERENCES TiposCoche (IdTipoCoche);

INSERT INTO Marcas (Nombre, Logo)
VALUES
('Acura','acura-logo.jpg'),
('Alfa Romeo','alfa-romeo-logo.jpg'),
('Aston Martin','aston-martin-logo.jpg'),
('Audi','audi-logo.jpg'),
('Bentley','bentley-logo.jpg'),
('BMW','bmw-logo.jpg'),
('Bugatti','bugatti-logo.jpg'),
('Buick','buick-logo.jpg'),
('Cadillac','cadillac-logo.jpg'),
('Chevrolet','chevrolet-logo.jpg'),
('Chrysler','chrysler-logo.jpg'),
('Citroen','citroen-logo.jpg'),
('Dodge','dodge-logo.jpg'),
('Ferrari','ferrari-logo.jpg'),
('Fiat','fiat-logo.jpg'),
('Ford','ford-logo.jpg'),
('Geely','geely-logo.jpg'),
('General Motors','general-motors-logo.jpg'),
('GMC','gmc-logo.jpg'),
('Honda','honda-logo.jpg'),
('Hyundai','hyundai-logo.jpg'),
('Infiniti','infiniti-logo.jpg'),
('Jaguar','jaguar-logo.jpg'),
('Jeep','jeep-logo.jpg'),
('Kia Motors','kia-motors-logo.jpg'),
('Koenigsegg','koenigsegg-logo.jpg'),
('Lamborghini','lamborghini-logo.jpg'),
('Land Rover','land-rover-logo.jpg'),
('Lexus','lexus-logo.jpg'),
('Maserati','maserati-logo.jpg'),
('Mazda','mazda-logo.jpg'),
('McLaren','mclaren-logo.jpg'),
('Mercedes Benz','mercedes-benz-logo.jpg'),
('Mini Car','mini-car-logo.jpg'),
('Mitsubishi Motors','mitsubishi-motors-logo.jpg'),
('Nissan','nissan-logo.jpg'),
('Pagani','pagani-logo.jpg'),
('Peugeot','peugeot-logo.jpg'),
('Posrche','posrche-logo.jpg'),
('Ram','ram-logo.jpg'),
('Renault','renault-logo.jpg'),
('Rolls Royce','rolls-royce-logo.jpg'),
('Saab','saab-logo.jpg'),
('Subaru','subaru-logo.jpg'),
('Suzuki','suzuki-logo.jpg'),
('Tata Motors','tata-motors-logo.jpg'),
('Tesla Motors','tesla-motors-logo.jpg'),
('Toyota','toyota-logo.jpg'),
('Volkswagen','volkswagen-logo.jpg'),
('Volvo','volvo-logo.jpg');

INSERT INTO TiposCoche (Nombre)
VALUES
	('4x4'),
	('Utilitario'),
	('Berlina'),
	('Coupe'),
	('Ecológico'),
	('Eléctrico'),
	('Monovolumen'),
	('Familiar');

INSERT INTO Modelos
		(IdMarca, IdTipoCoche, Nombre, FechaLanzamiento)
	VALUES
		('12', '2', 'C3', '2001-01-01'),
		('44', '4', 'Impreza', '1990-01-01'),
		('47', '4', 'Model S', '2011-01-01');
