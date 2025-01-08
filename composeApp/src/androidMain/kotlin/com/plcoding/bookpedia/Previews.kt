package com.plcoding.bookpedia

import BookListScreen
import BookSearchBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListState

@Preview
@Composable
private fun BookSearchBarPreview() {
    MaterialTheme {
        Box(
          modifier = Modifier
              .fillMaxWidth()
              .background(Color.White)
        ) {
            BookSearchBar(
                searchQuery = "",
                onSearchQueryChange = {},
                onImeSearch = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books,
        ),
        onAction = {}
    )
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://",
        authors = listOf("Masum Modi"),
        description = "Description of book $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.67845,
        ratingsCount = 5,
        numPages = 100,
        numEdition = 3
    )
}
