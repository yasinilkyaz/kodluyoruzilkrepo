# ödev 6
1.film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?
select round(avg(rental_rate), 3) from film
>Sonuç 2.980

2.film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?
select  count(title)  from film
where title like 'C%'

>Sonuç 92


3.film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?
select  max(length)  from film
where rental_rate = 0.99

>Sonuç 184


4.film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?
select  count(length)  from film
where length > 150

>Sonuç 242
