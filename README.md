# SimpleShoppingCartApp
This is a simple shopping cart application built with SpringBoot that allows users to perform CRUD operations on items in their cart. The application uses an in-memory data structure (a HashMap) to store cart items.

## Prerequisites
To run this application, you need to have the following installed on your system:

* Java 8 or higher
* Maven 3.6.3 or higher


## Getting started
To run the application, follow these steps:

1. Clone the repository to your local machine:
git clone https://github.com/mo-fsdev/SimpleShoppingCartApp.git

2. Navigate to the project directory:
cd SimpleShoppingCartApp

3. Build the application using Maven:
mvn clean install

4. Run the application:
mvn spring-boot:run

The application will start up and be available at http://localhost:8080.

## Usage
The shopping cart application provides REST endpoints for performing CRUD operations on cart items. The following endpoints are available:

* GET /cart - Retrieves all cart items.
* GET /cart/{id} - Retrieves a cart item by ID.
* POST /cart - Adds a new item to the cart.
* PUT /cart/{id} - Updates an existing item in the cart.
* DELETE /cart/{id} - Deletes an item from the cart.

All requests and responses are in JSON format.

## Examples
To add a new item to the cart, send a POST request to http://localhost:8080/cart with a JSON body like the following:

{
    "name": "Shirt",
    "quantity": 2
}

To update an existing item in the cart, send a PUT request to http://localhost:8080/cart/{id} with a JSON body like the following:

{
    "name": "Shirt",
    "quantity": 3
}

To retrieve all cart items, send a GET request to 
http://localhost:8080/cart.

To retrieve a specific cart item by ID, send a GET request to 
http://localhost:8080/cart/{id}.

To delete a specific cart item by ID, send a DELETE request to 
http://localhost:8080/cart/{id}.

## Conclusion
That's it! You now have a simple shopping cart application up and running. Feel free to modify the code and experiment with different features.





