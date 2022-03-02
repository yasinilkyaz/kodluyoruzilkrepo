# ödev 5

1.film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sıralayınız.

select  * from film

where title like '%n'

order by length desc

limit 5

>Sonuç "Soldiers Evolution"-"Sorority Queen"-"King Evolution"-"Frontier Cabin"-"Wife Turn"


2.film tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kısa (length) ikinci(6,7,8,9,10) 5 filmi(6,7,8,9,10) sıralayınız.

select  * from film

where title like '%n'

order by length

offset 5

limit 5

>Sonuç "Jekyll Frogmen"-"Daughter Madigan"-"Room Roman"-"Camelot Vacation"-"Birds Perdition"

3.customer tablosunda bulunan last_name sütununa göre azalan yapılan sıralamada store_id 1 olmak koşuluyla ilk 4 veriyi sıralayınız.

select  * from customer

where store_id = 1

order by last_name desc

limit 4

> Sonuç "Young"-"Yanez"-"Wyman"-"Woods"