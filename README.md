# News Fetcher Spring Boot Application

This project is a Spring Boot application that provides an API to fetch news from an external website using an API key. The `NewsController` retrieves the latest news and returns it in JSON format.

###
File Structure

news-fetcher/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ └── com/ │ │ │ └── example/ │ │ │ └── newsfetcher/ │ │ │ ├── NewsFetcherApplication.java # Main Spring Boot application class │ │ │ ├── controller/ │ │ │ │ └── NewsController.java # REST controller for fetching news │ │ │ ├── config/ │ │ │ │ └── AppConfig.java # Configuration class for RestTemplate │ │ │ └── model/ │ │ │ └── NewsResponse.java # Model class for parsing API response │ │ └── resources/ │ │ ├── application.properties # Configuration properties │ │ └── static/ # Static files (if any) │ └── test/ │ └── java/ │ └── com/ │ └── example/ │ └── newsfetcher/ │ └── NewsFetcherApplicationTests.java # Unit tests ├── .gitignore ├── pom.xml # Maven build file └── README.md # Project documentation
