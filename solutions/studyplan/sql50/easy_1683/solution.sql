# My solution first way
# Runtime : 534ms

SELECT tweet_id
FROM Tweets
WHERE LENGTH(content)>15;

# Second solution (Chat Gpt advice) -> CHAR_LENGTH() method
# Runtime : 544ms

SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content)>15;
