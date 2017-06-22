Expidia Offer WEB APP  [![Build Status](https://travis-ci.org/hungrywolf/expediaOffers.svg?branch=master)](https://travis-ci.org/hungrywolf/expediaOffers)
=========================================

*This project contains the sample code*

Written using :

Maven 3.1.0 </br>
oraclejdk8 </br>
Spring MVC </br>
Java Doc </br>

In order to execute all the tests, all you need to do is run:

    $ mvn clean package
    $ java -jar .\target\dependency\webapp-runner.jar .\target\*.war
    
classes documentation is under the doc directory
    
you can build and test on https://travis-ci.org/ please try [![Build Status](https://travis-ci.org/hungrywolf/expediaOffers.svg?branch=master)](https://travis-ci.org/hungrywolf/expediaOffers)

for demo the war is hosted by https://www.heroku.com/ at https://nameless-hollows-84640.herokuapp.com/index

Quick Description
=========================================
the index page have 4 fields "Destination Name" with should be the full long name for the destination like "Florence (province), Italy" , 
the "Date Range" will open a calendar to choose the range , "Hotel Star rating" and "Hotel guest rating" both have a group of check boxes 
if you choose 2 or more check boxes the web app will take only the max and the min values to filter and get the data between that range 
if you choose only one check box that value will be taken as the minimum any value equal or larger will return from the service . 










 
