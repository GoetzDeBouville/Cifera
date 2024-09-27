package org.zinchenko.dev.app.utils.extensions

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format.FormatStringsInDatetimeFormats
import kotlinx.datetime.format.byUnicodePattern
import kotlinx.datetime.toLocalDateTime

const val DATE_TIME_FORMAT = "MMM d, yyyy, HH:mm"

@OptIn(FormatStringsInDatetimeFormats::class)
fun Instant.formatInstantToDateString(): String {
    val datetimeInSystemZone: LocalDateTime = this.toLocalDateTime(TimeZone.currentSystemDefault())

    val dateTimeFormat = LocalDateTime.Format {
        byUnicodePattern(DATE_TIME_FORMAT)
    }

    return dateTimeFormat.format(datetimeInSystemZone)
}
