# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 



 As a movie selling company I want to get more subscriptions so that I can expand my companies reach and increase revenue 


## Dataset 


Dataset: https://www.kaggle.com/datasets/octopusteam/imdb-top-1000-movies/data
- **Title** (String) - name of the movie
- **Genres** (String) - the genre of the movie 
- **averageRating** (double) - The total average rating of the movie 
- **numVotes** (int) - The accumiliation of votes for a movie
- **releaseYear** (int) - The year the movie was released

## UML Diagram 


![UML Diagram for my project]![alt text](image-1.png)


## Description 

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project

In this projcet we took a top 1000 movies list and organized it in our code by making every column a 1D array. Our project answers the user's goal of finding out the most popular genre in the top 1000 by using a method to analyze which genre has the most popular movies. To do this, we used the file reader to get every index from each array and printed it out with our toString method in order from title to release year. 