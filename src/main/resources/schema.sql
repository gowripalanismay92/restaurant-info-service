drop table if exists menuitem CASCADE 
drop table if exists restaurant CASCADE 
create table restaurant (restaurantid varchar(255) not null, area varchar(255), location varchar(255), name varchar(255), rating float, primary key (restaurantid))
create table menuitem (menuid varchar(255) not null, description varchar(255), name varchar(255), price integer, restaurantid varchar(255), primary key (menuid))