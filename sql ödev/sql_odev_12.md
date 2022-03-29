>1.film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

select count(length) from film

where length > (select avg(length) from film)

sonuç 489

>2.film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

select count(rental_rate),rental_rate from film

group by rental_rate

order by rental_rate desc

limit 1

Sonuç 336	4.99



>3.film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.

select title,rental_rate,replacement_cost from film

where rental_rate=(select min(rental_rate)from film) and

replacement_cost=(select min(replacement_cost)from film)

Sonuç 15 film

>4.payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

select   payment.customer_id , count(payment.customer_id) from payment

group by payment.customer_id

order by count(customer_id) desc

limit 5

148	45,
526	42,
144	40,
75	39,
236	39,