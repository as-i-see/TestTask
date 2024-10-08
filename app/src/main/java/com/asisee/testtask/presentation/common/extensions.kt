package com.asisee.testtask.presentation.common

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File
import java.util.UUID

fun Context.createTempFile(): File = File.createTempFile("${UUID.randomUUID()}_", ".jpg", externalCacheDir)

fun Context.getUriForFile(photoFile: File): Uri = FileProvider.getUriForFile(this, "${this.packageName}.provider", photoFile)