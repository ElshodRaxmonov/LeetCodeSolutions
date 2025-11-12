# My solution first way
# Runtime : 1285ms

SELECT v.customer_id , COUNT(v.customer_id) as count_no_trans
FROM Visits as v
         LEFT JOIN Transactions as t
                   ON v.visit_id = t.visit_id
WHERE t.transaction_id is null
GROUP BY v.customer_id;