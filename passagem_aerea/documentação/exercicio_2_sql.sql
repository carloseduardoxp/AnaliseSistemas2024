DROP DATABASE IF EXISTS db_passagem_aerea;

create database db_passagem_aerea;

use db_passagem_aerea;

create table tb_cidade (
   cod_cidade integer not null auto_increment,
   nom_cidade varchar(255) not null,
   populacao integer not null,
   primary key(cod_cidade)
);

insert into tb_cidade (nom_cidade,populacao) values ('Rio de Janeiro',6748000);
insert into tb_cidade (nom_cidade,populacao) values ('Uberlândia',750000);
insert into tb_cidade (nom_cidade,populacao) values ('Guarulhos',1400000);
insert into tb_cidade (nom_cidade,populacao) values ('Campo Grande',900000);

create table tb_aeroporto (
   cod_aeroporto integer not null auto_increment,
   nom_aeroporto varchar(255) not null,
   des_localizacao varchar(255) not null,
   cod_cidade integer not null,
   primary key(cod_aeroporto),
   foreign key(cod_cidade) references tb_cidade(cod_cidade)
);

insert into tb_aeroporto (nom_aeroporto,des_localizacao,cod_cidade) values ('Galeão','22° 48'' 36" S 43° 15'' 02"',1);
insert into tb_aeroporto (nom_aeroporto,des_localizacao,cod_cidade) values ('Santos Dummont','22° 54′ 36″ S, 43° 09′ 45″ O"',1);
insert into tb_aeroporto (nom_aeroporto,des_localizacao,cod_cidade) values ('Tenente Coronel Aviador César Bombonato','18° 53′ 01″ S, 48° 13′ 31″ O"',2);
insert into tb_aeroporto (nom_aeroporto,des_localizacao,cod_cidade) values ('Governador André Franco Montoro','23° 25′ 55″ S, 46° 28′ 10″ O"',3);
insert into tb_aeroporto (nom_aeroporto,des_localizacao,cod_cidade) values ('Aeroporto Internacional de Campo Grande','20° 28′ 10″ S, 54° 40′ 13″ O"',4);


create table tb_voo (
   cod_prefixo varchar(255) not null,
   cod_aeroporto_origem integer not null,
   cod_aeroport_destino integer not null,
   primary key (cod_prefixo),
    foreign key(cod_aeroporto_origem) references tb_aeroporto(cod_aeroporto),
    foreign key(cod_aeroport_destino) references tb_aeroporto(cod_aeroporto)
);

insert into tb_voo(cod_prefixo,cod_aeroporto_origem,cod_aeroport_destino) values ('G3 1331',3,4);
insert into tb_voo(cod_prefixo,cod_aeroporto_origem,cod_aeroport_destino) values('G3 1496',4,5);

create table tb_programacao_voo(
   cod_programacao_voo integer not null auto_increment,
   cod_prefixo_voo varchar(255) not null,
   dat_partida datetime not null,
   dat_chegada datetime not null,
   nom_aeronave varchar(255) not null,
   qtd_passageiros integer not null,
   primary key(cod_programacao_voo),
   foreign key(cod_prefixo_voo) references tb_voo(cod_prefixo)
);

insert into tb_programacao_voo(cod_prefixo_voo,dat_partida,dat_chegada,nom_aeronave,qtd_passageiros) values ('G3 1331','2024-09-05 21:06:00','2024-09-05 22:24:00','BOEING 737 MAX',170);
insert into tb_programacao_voo(cod_prefixo_voo,dat_partida,dat_chegada,nom_aeronave,qtd_passageiros) values ('G3 1331','2024-09-06 19:35:00','2024-09-05 21:00:00','BOEING 737 700',140);
insert into tb_programacao_voo(cod_prefixo_voo,dat_partida,dat_chegada,nom_aeronave,qtd_passageiros) values ('G3 1331','2024-09-07 19:30:00','2024-09-05 20:35:00','BOEING 737 800',180);
insert into tb_programacao_voo(cod_prefixo_voo,dat_partida,dat_chegada,nom_aeronave,qtd_passageiros) values ('G3 1496','2024-09-10 23:30:00','2024-09-11 01:10:00','BOEING 737 800',180);

create table tb_cliente(
   cpf_cliente char(14) not null,
   nom_cliente varchar(255) not null,
   des_email varchar(255) not null,
   primary key(cpf_cliente)
);

insert into tb_cliente(cpf_cliente,nom_cliente,des_email) values ('000.000.000-00','Ronaldo Fenômeno','ronaldofenomeno@gmail.com');

create table tb_passagem(
   cod_reserva char(6) not null,
   vlr_passagem numeric(12,2) not null,   
   cpf_cliente char(14) not null,
   primary key(cod_reserva),
   foreign key(cpf_cliente) references tb_cliente(cpf_cliente)
);

insert into tb_passagem(cod_reserva,vlr_passagem,cpf_cliente) values ('HKGAUL',585.56,'000.000.000-00');

create table tb_escala (
   cod_programacao_voo integer not null,
   cod_reserva char(6) not null,
   num_poltrona varchar(12) not null,
   primary key(cod_programacao_voo,cod_reserva),
   foreign key(cod_programacao_voo) references tb_programacao_voo(cod_programacao_voo),
   foreign key(cod_reserva) references tb_passagem(cod_reserva)
);
   
insert into tb_escala(cod_programacao_voo,cod_reserva,num_poltrona) values (1,'HKGAUL','5A');
insert into tb_escala(cod_programacao_voo,cod_reserva,num_poltrona) values (4,'HKGAUL','24');



