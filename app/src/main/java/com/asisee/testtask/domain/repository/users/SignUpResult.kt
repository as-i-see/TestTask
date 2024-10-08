package com.asisee.testtask.domain.repository.users

import com.asisee.testtask.data.remote.users.Fails

sealed interface SignUpResult {
    data object Success : SignUpResult
    data object EmailAlreadyRegistered: SignUpResult
    data object TokenExpired: SignUpResult
    data class ValidationError(val fails: Fails) : SignUpResult
}