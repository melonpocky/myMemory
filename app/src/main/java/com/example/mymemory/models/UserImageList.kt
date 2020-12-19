package com.example.mymemory.models

import com.google.firebase.firestore.PropertyName

data class UserImageList (
    @PropertyName("images")
    val images: List<String>? = null)
  //nullable bc firebase mandates that it has a default val

