Book Search App

Welcome to the Book Search App! This is a Compose Multiplatform application designed to provide an intuitive and responsive interface for searching books, viewing details, and managing your favorite books. The project utilizes the Model-View-Intent (MVI) architecture and is powered by Koin for dependency injection.

Features
•	Search Books: Quickly search for books by title, author, or keyword.
•	Book Details: View detailed information about each book, including its description, author, and publication details.
•	Favorites: Add or remove books from your favorites list and access them easily.
•	Cross-Platform: Built with Compose Multiplatform to support multiple platforms like Android, iOS, and desktop.

Technology Stack

Frameworks and Libraries
•	Compose Multiplatform: UI toolkit for building cross-platform user interfaces.
•	Koin: A lightweight dependency injection framework for Kotlin.
•	MVI Architecture: Ensures unidirectional data flow for a predictable and maintainable state management system.

Tools
•	Kotlin: The primary programming language.
•	Gradle: Build system.
•	Jetpack Compose: For Android-specific UI components.
•	Ktor or Retrofit (Optional): For API calls (depending on your preference).
•	SQLDelight or Room (Optional): For local data persistence.

Project Structure

The project follows a clean architecture pattern:
•	domain: Contains use cases and business logic.
•	data: Handles API calls, local storage, and repository implementations.
•	presentation: UI layer, including ViewModels, Composables, and MVI-related components.
•	di: Dependency injection modules configured with Koin.

How to Run the Project
1.	Clone the Repository:

git clone <repository-url>
cd book-search-app


	2.	Setup Dependencies:
Ensure you have the required Kotlin Multiplatform setup and install dependencies using Gradle:

./gradlew build


	3.	Run the App:
	•	For Android:

./gradlew :androidApp:installDebug


	•	For iOS:
Open the iosApp project in Xcode and run it on a simulator or device.
•	For Desktop:
Run the desktop module using your IDE.

How to Use
1.	Search for Books:
•	Use the search bar to find books by entering a title, author, or keyword.
2.	View Details:
•	Tap on a book from the search results to view its detailed information.
3.	Manage Favorites:
•	Add a book to your favorites by tapping the “Add to Favorites” button.
•	Access your favorite books through the Favorites tab.

Contribution

We welcome contributions to this project! To contribute:
1.	Fork the repository.
2.	Create a new branch for your feature or bug fix.
3.	Commit your changes and submit a pull request.

Happy coding! 🚀