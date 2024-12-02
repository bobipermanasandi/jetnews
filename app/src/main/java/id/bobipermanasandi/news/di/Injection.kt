package id.bobipermanasandi.news.di

import android.content.Context
import id.bobipermanasandi.news.data.NewsRepository
import id.bobipermanasandi.news.data.local.room.NewsDatabase
import id.bobipermanasandi.news.data.remote.retrofit.ApiConfig

object Injection {
    fun provideRepository(context: Context): NewsRepository {
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        return NewsRepository.getInstance(apiService, dao)
    }
}