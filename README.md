# JavaBackendCourse
Patika Java backend course assignments.

### Homework 1 Answers:

```MySql
  SELECT title, description FROM film

  SELECT * FROM film WHERE length > 60 AND length < 75;

  SELECT * FROM film WHERE (rental_rate = 0.99 AND replacement_cost = 12.99) OR replacement_cost = 28.99;

  SELECT last_name FROM customer WHERE first_name = 'Mary';

  SELECT * FROM film WHERE length <= 50 AND (rental_rate != 2.99 OR rental_rate != 4.99);
```
### Homework 2 Answers:

```MySql
  SELECT * FROM film WHERE replacement_cost BETWEEN 12.99 AND 16.99;

  SELECT first_name, last_name FROM actor
  WHERE first_name IN ('Penelope', 'Nick','Ed')

  SELECT * FROM film
  WHERE rental_rate IN (0.99, 2.99, 4.99) AND replacement_cost IN (12.99, 15.99, 28.99)
```

### Homework 3 Answers:

```MySql
  SELECT country FROM country WHERE country LIKE 'A%a'

  SELECT first_name, last_name FROM actor
  WHERE first_name IN ('Penelope', 'Nick','Ed')

  SELECT country FROM country WHERE country LIKE '_____%n'

  SELECT title FROM film WHERE title ILIKE '%T%T%T%T%'

  SELECT title FROM film
  WHERE title ILIKE 'C%' AND length > 90 AND rental_rate = 2.99
```



