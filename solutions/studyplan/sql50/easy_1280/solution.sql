# My solution first way
# Runtime : 363ms

SELECT  author_id as id
FROM Views
WHERE author_id = viewer_id
GROUP BY author_id
ORDER BY author_id ASC;

# My solution second way
# Runtime : 379ms

SELECT DISTINCT author_id as id
FROM Views
WHERE author_id = viewer_id
ORDER BY author_id ASC;

# Solution in Leetcode
# Runtime : 357ms

select author_id as id
from views
group by author_id
having count(case when author_id=viewer_id then 1 end) >0
order by id asc