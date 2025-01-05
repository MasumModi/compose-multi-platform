package com.plcoding.bookpedia.core.presentation

import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.error
import com.plcoding.bookpedia.core.domain.DataError

fun DataError.toUiText(): UiText {
    val stringRes = when(this) {
        DataError.Remote.SERVER -> Res.string.error
        DataError.Remote.NO_INTERNET -> Res.string.error
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.error
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.error
        DataError.Remote.SERIALIZATION -> Res.string.error
        DataError.Remote.UNKNOWN -> Res.string.error
        DataError.Local.DISK_FULL -> Res.string.error
        DataError.Local.UNKNOWN -> Res.string.error
    }
    return UiText.StringResourceId(stringRes)
}