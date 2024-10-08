package com.asisee.testtask.presentation.ui.users

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.asisee.testtask.domain.repository.users.UsersRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class UsersViewModel(usersRepository: UsersRepository) : ViewModel() {

    val users = usersRepository.getUsers().flowOn(Dispatchers.IO).cachedIn(viewModelScope)

    private val _refreshing = MutableStateFlow(false)
    val refreshing = _refreshing.asStateFlow()

    /**
     * Show refresh indicator for 500 ms
     */
    fun startRefresh() = viewModelScope.launch(Dispatchers.IO) {
        _refreshing.value = true
        delay(500)
        _refreshing.value = false
    }
}