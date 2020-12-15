# buscharter

* To install dependencies and run tests:

```
./gradlew clean build
```

* To run application
```
./gradlew bootRun
```

Example request for testing purpose and can be imported in postman:
```
curl --location --request POST 'http://localhost:8080/api/calculate-ticket' \
--header 'Content-Type: application/json' \
--data-raw '{
    "basePrice": 1,
    "taxRate": 1,
    "passengers": [
        {
            "passengerType": "CHILD",
            "luggageCount": 1
        },
        {
            "passengerType": "ADULT",
            "luggageCount": 2
        }
    ]
}'
```