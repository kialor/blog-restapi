# blog-restapi
This is a simple RESTful API for a blog platform built using Spring Boot. It allows users to create, read, update, and delete blog posts.

Running the project:
Run the BlogApplication class on IDE and the application will start running on http://localhost:8080.

Testing the project:
To test the application API endpoints use a tool such as POSTMAN to create, get, update, and delete blog posts.

To CREATE posts:
Set the HTTP method to POST and enter http://localhost:8080/posts as the URL. In the request body as JSON data enter in a blog post.
ex)
{
    "title": "First Blog Post",
    "content": "Hello. This is my first blog post.",
    "author": "Joe"
}
Send request. On http://localhost:8080/posts, the new post will be displayed.

To UPDATE posts:
Set the HTTP method to PUT and enter http://localhost:8080/posts/{id} as the URL. In the request body as JSON data enter in the updated blog post.
ex)
{
    "title": "First Blog Post",
    "content": "Hello. This is my very first blog post!",
    "author": "Joe S."
}
Send request. On http://localhost:8080/posts, the updated post will be displayed.

To DELETE posts:
Set the HTTP method to DELETE and enter http://localhost:8080/posts/{id} as the URL.
Send request. Post will be removed from http://localhost:8080/posts.

To GET all posts or a specific post:
Set the HTTP method to GET and enter http://localhost:8080/posts/ (for all posts) or http://localhost:8080/posts/{id} (for a specific post) as the url.
Send request and view http://localhost:8080/posts/ or http://localhost:8080/posts/{id}.

