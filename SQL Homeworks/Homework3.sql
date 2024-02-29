SELECT country FROM country WHERE country LIKE 'A%a'

SELECT first_name, last_name FROM actor
WHERE first_name IN ('Penelope', 'Nick','Ed')

SELECT country FROM country WHERE country LIKE '_____%n'

SELECT title FROM film WHERE title ILIKE '%T%T%T%T%'

SELECT title FROM film
WHERE title ILIKE 'C%' AND length > 90 AND rental_rate = 2.99