# DOW JONES PROBLEM SOLUTION

## Features
-Adding a data set block
-Adding a weekly Index (row)
-Searching no of stocks from given data set

## Tech
Java - Springboot
Mongo

## Instructions
Download and install brew and Mongo MacOS from: https://github.com/mongodb/homebrew-brew
Once Mongo DB community set up is completed, Start the springboot application and call the delete/all GET operation to clear the data clutter.

### Supported operations
````
Post Single record
POST:http://localhost:8080/add/record
RequestBody:  
{
    "id":1,
   "quarter":"1",
   "stock":"AA",
   "date":"1/7/2011",
   "open":",$15.82",
   "high":",$16.72",
   "low":"$15.78",
   "close":"$16.42",
   "volume":"239655616",
   "percentChangePrice":"3.79267",
   "percentChangeVolumeOverLastWeek":"",
   "previousWeeksVolume":"",
   "nextWeeksOpen":"$16.71",
   "nextWeeksClose":"15.97",
   "percentChangeNextWeeksPrice":"-4.42849",
   "daysToNextDividend":"26",
   "percentReturnNextDividend":"0.182704"
}
````
````
Post bulk records
POST: http://localhost:8080/add/records
Request Body:
[{
	"id": 3,
   "quarter":"1",
   "stock":"AA",
   "date":"1/7/2011",
   "open":",$15.82",
   "high":",$16.72",
   "low":"$15.78",
   "close":"$16.42",
   "volume":"239655616",
   "percentChangePrice":"3.79267",
   "percentChangeVolumeOverLastWeek":"",
   "previousWeeksVolume":"",
   "nextWeeksOpen":"$16.71",
   "nextWeeksClose":"15.97",
   "percentChangeNextWeeksPrice":"-4.42849",
   "daysToNextDividend":"26",
   "percentReturnNextDividend":"0.182704"
},
{
	"id":4,
   "quarter":"1",
   "stock":"AA",
   "date":"1/7/2011",
   "open":",$15.82",
   "high":",$16.72",
   "low":"$15.78",
   "close":"$16.42",
   "volume":"239655616",
   "percentChangePrice":"3.79267",
   "percentChangeVolumeOverLastWeek":"",
   "previousWeeksVolume":"",
   "nextWeeksOpen":"$16.71",
   "nextWeeksClose":"15.97",
   "percentChangeNextWeeksPrice":"-4.42849",
   "daysToNextDividend":"26",
   "percentReturnNextDividend":"0.182704"
}]
````
````
Get all records of AA stock
GET: http://localhost:8080/get?stockName=AA
````
````
Get ll records
GET: http://localhost:8080/get/all
````
````
Delete all records
GET: http://localhost:8080/delete/all
````
