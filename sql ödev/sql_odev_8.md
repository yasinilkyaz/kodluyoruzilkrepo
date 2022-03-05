1.test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

create table employee(
id serial Primary key,
name varchar(50),
birthday DATE,
email varchar(100)
);

2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.


insert into employee (id, name, birthday, email) values (1, 'Miguela', '2021-12-17', 'mnarey0@timesonline.co.uk');
insert into employee (id, name, birthday, email) values (2, 'Arie', '2021-10-31', 'alidgey1@engadget.com');
insert into employee (id, name, birthday, email) values (3, 'Olly', '2021-10-18', 'ogronow2@cam.ac.uk');
insert into employee (id, name, birthday, email) values (4, 'Gusty', '2021-07-27', 'gstower3@instagram.com');
insert into employee (id, name, birthday, email) values (5, 'Tito', '2021-10-05', 'tizen4@wufoo.com');
insert into employee (id, name, birthday, email) values (6, 'Blakeley', '2021-11-08', 'brostern5@cargocollective.com');
insert into employee (id, name, birthday, email) values (7, 'Mallory', '2021-07-04', 'mkilgallen6@usgs.gov');
insert into employee (id, name, birthday, email) values (8, 'Stacia', '2021-08-02', 'sbrabon7@techcrunch.com');
insert into employee (id, name, birthday, email) values (9, 'Ruby', '2022-01-04', 'rcaughtry8@wp.com');
insert into employee (id, name, birthday, email) values (10, 'Griswold', '2021-09-29', 'gkruger9@is.gd');
insert into employee (id, name, birthday, email) values (11, 'Dallas', '2022-01-30', 'dheersa@fema.gov');
insert into employee (id, name, birthday, email) values (12, 'Layne', '2022-01-18', 'llumleyb@rediff.com');
insert into employee (id, name, birthday, email) values (13, 'Upton', '2021-12-11', 'ubessc@reuters.com');
insert into employee (id, name, birthday, email) values (14, 'Christa', '2021-10-04', 'cfairnd@wisc.edu');
insert into employee (id, name, birthday, email) values (15, 'Costa', '2022-01-27', 'cwhitewaye@walmart.com');
insert into employee (id, name, birthday, email) values (16, 'Arni', '2021-08-09', 'abondleyf@unicef.org');
insert into employee (id, name, birthday, email) values (17, 'Nesta', '2021-08-08', 'nlimbrickg@surveymonkey.com');
insert into employee (id, name, birthday, email) values (18, 'Madeleine', '2021-07-28', 'mgilleyh@apache.org');
insert into employee (id, name, birthday, email) values (19, 'Adriaens', '2021-07-10', 'anoonani@gov.uk');
insert into employee (id, name, birthday, email) values (20, 'Jack', '2021-07-09', 'jtatamj@ovh.net');
insert into employee (id, name, birthday, email) values (21, 'Jecho', '2022-02-02', 'jthirlwallk@amazon.com');
insert into employee (id, name, birthday, email) values (22, 'Rossie', '2022-01-31', 'rstigelll@purevolume.com');
insert into employee (id, name, birthday, email) values (23, 'Corbet', '2021-10-01', 'charlowem@slashdot.org');
insert into employee (id, name, birthday, email) values (24, 'Barnabe', '2021-08-14', 'bkuberan@yale.edu');
insert into employee (id, name, birthday, email) values (25, 'Bailie', '2021-10-03', 'bfooteo@walmart.com');
insert into employee (id, name, birthday, email) values (26, 'Gisella', '2021-07-17', 'gboeterp@homestead.com');
insert into employee (id, name, birthday, email) values (27, 'Skipton', '2022-02-12', 'sdarlowq@admin.ch');
insert into employee (id, name, birthday, email) values (28, 'Gretta', '2021-05-20', 'groglierir@vistaprint.com');
insert into employee (id, name, birthday, email) values (29, 'Huey', '2022-02-22', 'hadamiecs@cisco.com');
insert into employee (id, name, birthday, email) values (30, 'Kevina', '2021-11-08', 'ksillitot@ifeng.com');
insert into employee (id, name, birthday, email) values (31, 'Marcela', '2021-03-23', 'mblabberu@cnbc.com');
insert into employee (id, name, birthday, email) values (32, 'Roxi', '2021-10-21', 'rpauligv@addtoany.com');
insert into employee (id, name, birthday, email) values (33, 'Jerry', '2021-10-28', 'jbaggarleyw@deliciousdays.com');
insert into employee (id, name, birthday, email) values (34, 'Bart', '2022-02-18', 'brobartx@addtoany.com');
insert into employee (id, name, birthday, email) values (35, 'Carmella', '2021-10-05', 'cglasardy@yelp.com');
insert into employee (id, name, birthday, email) values (36, 'Loreen', '2022-01-16', 'learlesz@scientificamerican.com');
insert into employee (id, name, birthday, email) values (37, 'Fina', '2021-12-09', 'fcurrao10@flavors.me');
insert into employee (id, name, birthday, email) values (38, 'Tabbie', '2021-04-20', 'tcockerell11@de.vu');
insert into employee (id, name, birthday, email) values (39, 'Salomon', '2021-06-04', 'smarshal12@exblog.jp');
insert into employee (id, name, birthday, email) values (40, 'Goldi', '2021-03-28', 'grossbrooke13@usgs.gov');
insert into employee (id, name, birthday, email) values (41, 'Fancy', '2021-05-16', 'fnapoleon14@a8.net');
insert into employee (id, name, birthday, email) values (42, 'Chere', '2021-04-16', 'ckingzet15@pcworld.com');
insert into employee (id, name, birthday, email) values (43, 'Lyndsie', '2021-08-23', 'lgoodger16@prnewswire.com');
insert into employee (id, name, birthday, email) values (44, 'Brigit', '2021-05-20', 'besser17@canalblog.com');
insert into employee (id, name, birthday, email) values (45, 'Kellsie', '2021-06-22', 'kportwaine18@census.gov');
insert into employee (id, name, birthday, email) values (46, 'Lynnet', '2021-04-27', 'lmossman19@narod.ru');
insert into employee (id, name, birthday, email) values (47, 'Mikol', '2021-05-03', 'mwardlow1a@dedecms.com');
insert into employee (id, name, birthday, email) values (48, 'Richmond', '2021-03-24', 'rbeccera1b@jalbum.net');
insert into employee (id, name, birthday, email) values (49, 'Cherilyn', '2021-11-30', 'cdoxsey1c@amazon.co.jp');
insert into employee (id, name, birthday, email) values (50, 'Pasquale', '2021-05-22', 'pcudmore1d@feedburner.com');

3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

update employee

set name='Yasin',

birthday = '1995-10-15',

email = 'yasinilkyaz@gmail.com'

where id = 1;

>1 update

update employee

set name='deneme2',

birthday = '1985-11-15',

email = 'deneme2@asd.com'

where id = 2;

>1 update

update employee

set name='deneme3',

birthday = '1990-11-15',

email = 'deneme3@asd.com'

where name like  'A%';

>2 update

update employee

set name='deneme3',

birthday = '1990-11-15',

email = 'deneme3@asd.com'

where birthday between  '2021-01-01' and '2022-01-01';

>36 update

update employee

set name='deneme4'

where id between '30' and '35';

> 6 update

4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

delete from employee

where id = 37;

>1 delete

delete from employee

where birthday = '2022-01-16';

>1 delete

delete from employee

where email = 'hadamiecs@cisco.com';

>1 delete

delete from employee

where name = 'Skipton';

>1 delete

delete from employee

where id between '31' and '34';

>4 delete