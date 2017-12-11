# EstudoJSFEstagio
Estudo simples usando JSF, Bootstrap e JDBC

create table T_OCORRENCIA (
	id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
	num_ocorrencia INT NOT NULL,
	dh_inicial DATE NULL,
	defeito_eqpto NVARCHAR(200) NOT NULL,
	X_DEFEITO NUMERIC(6,2) NULL,
	Y_DEFEITO NUMERIC(6,2) NULL,
	causa INT NOT NULL,
	area VARCHAR NULL,
	expurgo BIT NOT NULL,
	CONSTRAINT FK_OCORRENCIA_CAUSA FOREIGN KEY(causa) REFERENCES T_CAUSA(id)
);

alter table t_ocorrencia
add constraint UN_OCORRENCIA UNIQUE(num_ocorrencia);

create table T_CAUSA (
	id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
	codigo VARCHAR(10) NOT NULL,
	descricao VARCHAR(100) NOT NULL
);
