Feature: User should login the Adactin Application

Background:  To verify user should login the application - 101

Given User should launch the adactin application
Then  User should Validate the login page
Then  User enter the username "<username>" and password "<password>" 
Then  User enter the login button

@tc1
Scenario Outline: To verify whether the check-outdate field accepts a later date than check in date - 102

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User Enter check-in-date as in test data "<+7date>"
And  User Enter check-out-date as in test data "<+5date>"
Then User Verify that system gives an error message for check in date
Then User Verify that system gives an error message for check out date
Then User click the search button

Examples:
| location | hotel       | roomtype | no of rooms | +7date    | +5date      |
| Sydney   | Hotel Creek | Standard | 1           |05/06/2019 | 03/06/2019  |
@tc1
Scenario Outline: To check if error is reported if check-out date field is in the past - 103

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User Enter check-in-date as in test data - before "<-date>"
And  User Enter check-out-date as in test data - before "<-todaydate>"
Then User click the search button
 

Examples:
| location | hotel       | roomtype | no of rooms | -date     | -todaydate |
| Sydney   | Hotel Creek | Standard | 1           |26/05/2019 | 23/05/2019 |
@tc1
Scenario Outline: To verify whether the select location should be match with search hotel page - 104

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
#Then User should verify that search location shuold be exactly match with next page of select hotel location


Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child |
| Sydney   | Hotel Creek | Standard | 1           |01/06/2019 | 02/06/2019 |  1     |  1    |
@tc1
Scenario Outline: To verify whether the checkin and checkout date is match with nextpage - 105

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
#Then verify the selected checkin date is match with nextpage 
#Then verify the selected checkout date is match with nextpage 
Then User click the search button 


Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child |
| Sydney   | Hotel Creek | Standard | 1           |01/06/2019 | 02/06/2019 |  1     |  1    |
@tc1
Scenario Outline: To verify whether the checkin and checkout date is match with nextpage - 106

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
Then verify that room enters in search page should be match with next page



Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child |
| Sydney   | Hotel Creek | Standard | 1           |01/06/2019 | 02/06/2019 |  1     |  1    |

Scenario Outline: To verify whether the checkin and checkout date is match with nextpage - 107

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
Then verify that roomtype enters in search page should be match with next page

Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child |
| Sydney   | Hotel Creek | Standard | 1           |01/06/2019 | 02/06/2019 |  1     |  1    |

Scenario Outline: Verify that total price(excl.GST) is being calculated as (price-per-night* no of-rooms*no-of-days) - 108

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
And  User should click the radiobuttoin
Then User should click the continue button
#Then Verify the price in the total price


Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child |
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    |


Scenario Outline: Verify that total price(excl.GST) is being calculated as (price-per-night* no of-rooms*no-of-days) - 109

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
And  User should click the radiobuttoin
Then User should click the continue button
Then User should enter the "<fn>"and"<ln>"and"<ba>"and "<cardnum>"
Then User should enter the card type "<type>" & "<month>" & "<year>" & "<ccvnum>"
Then User should click the booknow button
Then User should click the logout button



Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | fn    | ln   | ba      | cardnum        | type | month  |  year | ccvnum |  
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    | thenu | babu | kh road |1234567891234567| VISA | August | 2014 | 1234    |


Scenario Outline: Verify that total-price is being calculated as (price-per night* no-ofrooms* no-of-days + 10% GST”) - 110

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
And  User should click the radiobuttoin
Then User should click the continue button
#Then User should verify that total price match with the no of rrom days 




Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | 
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    | 


Scenario Outline: To check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous
screen - 111

Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
And  User should click the radiobuttoin
Then User should click the continue button
#Then User should verify that all the data with previous screen




Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | 
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    | 


Scenario Outline: To check correct Final billed price is Total Price + 10% Total price in Book a Hotelpage - 112

Then  User verify that correct username is displayed on the login page
Then  User should location as in test data "<location>"
And   User should hotel as in test data "<hotel>"
And   User should room type as in test data "<roomtype>"
And   User should no-of-rooms as in test data "<no of rooms>"
And   User should enter the today date "<todaydate>"
And   User should enter the tomorrow date "<today+date>"
Then  User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
And   User should click the radiobuttoin
Then  User should click the continue button
#Then User should verify that total billed price is matched with calculation



Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | 
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    |  



Scenario Outline: To verify whether the data displayed is same as the selected data in Book hotel page - 113

Then  User verify that correct username is displayed on the login page
Then  User should location as in test data "<location>"
And   User should hotel as in test data "<hotel>"
And   User should room type as in test data "<roomtype>"
And   User should no-of-rooms as in test data "<no of rooms>"
And   User should enter the today date "<todaydate>"
And   User should enter the tomorrow date "<today+date>"
Then  User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then  User click the search button 
And   User should click the radiobuttoin
Then  User should click the continue button
#Then  User should verify that hotel roomtype mo of rooms check in date check out date no of adults and children match with book hotel page



Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child |   
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    |       
 



Scenario Outline: Verify that total price(excl.GST) is being calculated as (price-per-night* no of-rooms*no-of-days) - 114

Then  User verify that correct username is displayed on the login page
Then  User should location as in test data "<location>"
And   User should hotel as in test data "<hotel>"
And   User should room type as in test data "<roomtype>"
And   User should no-of-rooms as in test data "<no of rooms>"
And   User should enter the today date "<todaydate>"
And   User should enter the tomorrow date "<today+date>"
Then  User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then  User click the search button 
And   User should click the radiobuttoin
Then  User should click the continue button
Then  User should enter the "<fn>"and"<ln>"and"<ba>"and "<cardnum>"
Then  User should enter the card type "<type>" & "<month>" & "<year>" & "<ccvnum>"
Then  User should click the booknow button
Then  User should generate the order number




Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | fn    | ln   | ba      | cardnum        | type | month  |  year | ccvnum |  
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    | thenu | babu | kh road |1234567891234567| VISA | August | 2014 | 1234    |


Scenario Outline: To verify whether the booked itinerary details are not editable - 115

Then  User verify that correct username is displayed on the login page
Then  User should location as in test data "<location>"
And   User should hotel as in test data "<hotel>"
And   User should room type as in test data "<roomtype>"
And   User should no-of-rooms as in test data "<no of rooms>"
And   User should enter the today date "<todaydate>"
And   User should enter the tomorrow date "<today+date>"
Then  User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then  User click the search button 
And   User should click the radiobuttoin
Then  User should click the continue button
Then  User should enter the "<fn>"and"<ln>"and"<ba>"and "<cardnum>"
Then  User should enter the card type "<type>" & "<month>" & "<year>" & "<ccvnum>"
Then  User should click the booknow button
When User should click the Booked Itinerary button
#Then User verify the my_itinerary page is not editable



Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | fn    | ln   | ba      | cardnum        | type | month  |  year | ccvnum |  
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    | thenu | babu | kh road |1234567891234567| VISA | August | 2014 | 1234    |


Scenario Outline: To check whether the booked itinerary reflects the correct informationin line with the booking. - 116
Then User verify that correct username is displayed on the login page
Then User should location as in test data "<location>"
And  User should hotel as in test data "<hotel>"
And  User should room type as in test data "<roomtype>"
And  User should no-of-rooms as in test data "<no of rooms>"
And  User should enter the today date "<todaydate>"
And  User should enter the tomorrow date "<today+date>"
Then User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then User click the search button 
And  User should click the radiobuttoin
Then User should click the continue button
Then User should enter the "<fn>"and"<ln>"and"<ba>"and "<cardnum>"
Then User should enter the card type "<type>" & "<month>" & "<year>" & "<ccvnum>"
Then User should click the booknow button
When User should click the Booked Itinerary button
#Then User Verify that the details are reflected correctly as per the booking



Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | fn    | ln   | ba      | cardnum        | type | month  |  year | ccvnum |  
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    | thenu | babu | kh road |1234567891234567| VISA | August | 2014 | 1234    |




Scenario Outline: To check whether “search order id ”query is working and displaying the relevant details. - 117
Then  User verify that correct username is displayed on the login page
Then  User should location as in test data "<location>"
And   User should hotel as in test data "<hotel>"
And   User should room type as in test data "<roomtype>"
And   User should no-of-rooms as in test data "<no of rooms>"
And   User should enter the today date "<todaydate>"
And   User should enter the tomorrow date "<today+date>"
Then  User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then  User click the search button 
And   User should click the radiobuttoin
Then  User should click the continue button
Then  User should enter the "<fn>"and"<ln>"and"<ba>"and "<cardnum>"
Then  User should enter the card type "<type>" & "<month>" & "<year>" & "<ccvnum>"
Then  User should click the booknow button
Then  User should generate the order number
When User should click the Booked Itinerary button
Then User should enter the order id and click the go button
#Then User Verify that the relevant details are displayed

Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | fn    | ln   | ba      | cardnum        | type | month  |  year | ccvnum |  
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    | thenu | babu | kh road |1234567891234567| VISA | August | 2014 | 1234    |





Scenario: Verify all the details of order number are correct as entered during saving order - 118
When User should click the Booked Itinerary button
Then User should enter the order id and click the go button
#Then User sholud Verify all the details of order number are correct as entered during saving order



Scenario Outline: To verify that the order gets cancelled after click on Cancel order number link - 119
Then  User verify that correct username is displayed on the login page
Then  User should location as in test data "<location>"
And   User should hotel as in test data "<hotel>"
And   User should room type as in test data "<roomtype>"
And   User should no-of-rooms as in test data "<no of rooms>"
And   User should enter the today date "<todaydate>"
And   User should enter the tomorrow date "<today+date>"
Then  User should enter the no of Adults "<adults>" and number of childrens "<child>"
Then  User click the search button 
And   User should click the radiobuttoin
Then  User should click the continue button
Then  User should enter the "<fn>"and"<ln>"and"<ba>"and "<cardnum>"
Then  User should enter the card type "<type>" & "<month>" & "<year>" & "<ccvnum>"
Then  User should click the booknow button
Then  User should generate the order number 
Then User should click the my_itinerary
#When User should  click the Booked Itinerary button
Then User should enter the order id and click the go button
Then User should cancel the selected order
Then User should handle the popup to cancel or ok then click cancel
#Then User verify that order number is cancelled and now longer exists in Booked Itinerary page

Examples:
| location | hotel       | roomtype | no of rooms |todaydate  | today+date | adults | child | fn    | ln   | ba      | cardnum        | type | month  |  year | ccvnum |  
| Sydney   | Hotel Creek | Standard | 2           |01/06/2019 | 02/06/2019 |  1     |  1    | thenu | babu | kh road |1234567891234567| VISA | August | 2014 | 1234    |







  



 