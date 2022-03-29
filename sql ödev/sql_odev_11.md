>1.actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.

(select first_name from actor)

union

(select first_name from customer)

647 sonuç


>2.actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.

(select first_name from actor)

intersect

(select first_name from customer)

72 sonuç


>3.actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.

(select first_name from actor)

except

(select first_name from customer)

56 sonuç

>4.İlk 3 sorguyu tekrar eden veriler için de yapalım.

union all

intersect all

except all
