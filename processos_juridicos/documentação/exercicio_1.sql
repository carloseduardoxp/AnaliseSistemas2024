DROP DATABASE IF EXISTS db_processos_juridicos;

create database db_processos_juridicos;

use db_processos_juridicos;

create table tb_tribunal (
   cod_tribunal integer not null auto_increment,
   nom_tribunal varchar(255) not null,
   primary key(cod_tribunal)
);

insert into tb_tribunal (nom_tribunal) values ('TRF-1');

create table tb_vara (
   cod_vara integer not null auto_increment,
   nom_vara varchar(255) not null,   
   cod_tribunal integer not null,
   primary key(cod_vara),
   foreign key(cod_tribunal) references tb_tribunal(cod_tribunal)
);

insert into tb_vara (nom_vara,cod_tribunal) values ('Cível',1);


create table tb_pessoa (
   cod_pessoa integer not null auto_increment,
   nom_pessoa varchar(255) not null,
   des_email varchar(255) not null,
   num_cpf char(14),
   num_cnpj char(17),
   primary key(cod_pessoa)
);

insert into tb_pessoa(nom_pessoa,des_email,num_cpf) values ('Carlos','carloseduardodantas@iftm.edu.br','000.000.000-00');
insert into tb_pessoa(nom_pessoa,des_email,num_cnpj) values ('Starfield Linhas Espaciais','starfield@gmail.com','0001.0001.0001-00');

create table tb_processo (
   num_processo varchar(255) not null,
   dat_abertura datetime not null,
   cod_vara integer not null,
   cod_cliente integer not null,
   cod_parte_contraria integer not null,   
   primary key (num_processo),
    foreign key(cod_vara) references tb_vara(cod_vara),
    foreign key(cod_cliente) references tb_pessoa(cod_pessoa),
    foreign key(cod_parte_contraria) references tb_pessoa(cod_pessoa)
);

insert into tb_processo(num_processo,dat_abertura,cod_vara,cod_cliente,cod_parte_contraria) values ('00345676-79.2014.4.01.3103','2023-09-06',1,1,2);

create table tb_audiencia(
   cod_audiencia integer not null auto_increment,
   dat_audiencia datetime not null,
   des_recomendacao varchar(255) not null,
   num_processo varchar(255) not null,
   primary key(cod_audiencia),
   foreign key(num_processo) references tb_processo(num_processo)
);

insert into tb_audiencia(dat_audiencia,des_recomendacao,num_processo) values ('2023-09-15',' advogado da parte contrária recomendou que o juiz arquive as acusações contra seu cliente com base nas evidências apresentadas durante a audiência e na alegação de legítima defesa','00345676-79.2014.4.01.3103');

create table tb_custo(
   cod_custo integer not null auto_increment,
   dat_custo datetime not null,
   des_custo varchar(255) not null,
   vlr_custo numeric(10,2) not null,
   num_processo varchar(255) not null,
   primary key(cod_custo),
   foreign key(num_processo) references tb_processo(num_processo)
);

insert into tb_custo(dat_custo,des_custo,vlr_custo,num_processo) values ('2023-09-15','deslocar até a cidade onde ocorreu a audiência',500,'00345676-79.2014.4.01.3103');
