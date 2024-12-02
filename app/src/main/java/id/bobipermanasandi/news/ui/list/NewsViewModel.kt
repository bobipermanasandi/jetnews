package id.bobipermanasandi.news.ui.list

import androidx.lifecycle.ViewModel
import id.bobipermanasandi.news.data.NewsRepository

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()

    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()
}