DROP table IF EXISTS cientificos;
DROP table IF EXISTS proyectos;
DROP table IF EXISTS asignados_a;

create table cientificos(
    dni varchar(8),
    nom_apels varchar(255),
	primary key (dni)
);

create table proyectos(
    id varchar(4),
    nombre varchar(255),
    horas int,
    primary key (id)
);

create table asignados_a(
    id int auto_increment,
    cientifico varchar(8),
    proyecto varchar(4),
    primary key (id),
    constraint asignados_a_fk foreign key (cientifico) references cientificos(dni),
    constraint asignados_a_fk_01 foreign key (proyecto) references proyectos(id)
);

insert into cientificos (dni, nom_apels)values('23452345', 'Alguien Importante');
insert into cientificos (dni, nom_apels)values('56786578', 'Joel Romero');
insert into cientificos (dni, nom_apels)values('48765678', 'Izan Dueso');

insert into proyectos (id, nombre, horas)values('AS01', 'P1', 300);
insert into proyectos (id, nombre, horas)values('AS02', 'P2', 350);
insert into proyectos (id, nombre, horas)values('AS03', 'P3', 320);

insert into asignados_a (cientifico, proyecto)values('23452345', 'AS01');
insert into asignados_a (cientifico, proyecto)values('56786578', 'AS02');
insert into asignados_a (cientifico, proyecto)values('48765678', 'AS03');