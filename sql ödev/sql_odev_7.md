1.film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.

select rating , Count(*) from film

group by rating

order by rating

>Sonuç 

"G"	178

"PG"	194

"PG-13"	223

"R"	195

"NC-17"	210

2.film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.

select replacement_cost , Count(*) from film

group by replacement_cost

having count(replacement_cost)>50

Sonuç 
13.99	55

20.99	57

27.99	53

29.99	53

12.99	55

14.99	51

22.99	55

21.99	55


3.customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir?

select store_id , Count(*) from customer

group by store_id

Sonuç 
1	326 
2	273


4.city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.

Select country_id, count(*) From city

group by country_id

order by count(country_id) desc

limit 5


Sonuç
44	60
23	53
103	35
50	31
60	30