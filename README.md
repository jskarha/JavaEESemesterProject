# JavaEESemesterProject

## Problem Statement

Magic: The Gathering players often want to share 
decklists with each other. However, doing so is often
very cumbersome. If you want to write out a list from
someone's screenshot or picture, you have to do it by hand.
If you want to buy those cards, that's yet another step.
If you want to check if this deck has appeared in any professional events,
or if it has appeared with minor alterations (~4 cards different), then
that is a huge amount of manual work to figure out.

My plan is, at a minimum, to design a website where you can upload
an image to a WebAssembly program running in the browser, and that program will parse out
a list of all the cards that appear in that image as a decklist, and then
store that image and decklist on a per user basis. Users can provide
a website url (imgur, etc), or upload the image directly.

I also aim to make interacting with, sharing and comparing decklists to be
a much easier, more intuitive process. 


## Project Technologies/Techniques

* Authentication
  * All: submit images and get decklist link
  * User: history of submitted images
  * Admin: CRUD on everything
  
* Database (SQL/Hibernate)
  * Store all images and generated decklists
  * store registered user information

* APIs
  * gatherer.wizards.com
  * magicthegathering.io
  * mtgjson.com

* WebAssembly (independent research topic)

* Logging (Log4j)

* AWS Hosted Site

* Unit Testing (>80% coverage)

## Design

  * [Screen Design](design/screens.md)