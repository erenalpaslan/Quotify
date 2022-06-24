package com.easylife.quotify.data

import com.easylife.quotify.data.repository.RemoteQuoteRepositoryImpl
import com.easylife.quotify.domain.repository.RemoteQuoteRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<RemoteQuoteRepository> { RemoteQuoteRepositoryImpl(get()) }
}