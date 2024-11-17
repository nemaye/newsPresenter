# News Fetcher Spring Boot Application

This project is a Spring Boot application that provides an API to fetch news from an external website using an API key. The `NewsController` retrieves the latest news and returns it in JSON format.

### File Structure

AggregatorAPI  
└── demo  
    ├── config  
    │   ├── JWTConfig.java  
    │   └── WebSecurtyConfig.java  
    ├── controller  
    │   ├── NewsController.java  
    │   ├── PreferenceController.java  
    │   └── SubscriberController.java  
    ├── DemoApplication.java  
    ├── entity  
    │   ├── MemberModel.class  
    │   └── MemberModel.java  
    ├── filter  
    │   └── JWTFilter.java  
    ├── model  
    │   ├── Member.java  
    │   ├── Preference.java  
    │   └── SignIn.java  
    ├── repository  
    │   ├── PreferenceRepository.java  
    │   └── SubscriberRepository.java  
    └── service  
        ├── NewsService.java  
        ├── PreferenceService.java  

### API

POST /api/subscriber/register
POST /api/subscriber/signin
PUT /api/preference/{}
GET /api/news/{}

