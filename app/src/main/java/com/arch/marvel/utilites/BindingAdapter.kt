package com.arch.marvel.utilites

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.arch.marvel.data.NetworkState

@BindingAdapter("app:isLoading")
fun <T> showWhenLoading(view: View, networkState: NetworkState<T>?) {
    view.isVisible = networkState is NetworkState.OnLoading
}

@BindingAdapter("app:isSuccess")
fun <T> showWhenSuccess(view: View, networkState: NetworkState<T>?) {
    view.isVisible = networkState is NetworkState.OnSuccess
}

@BindingAdapter("app:isFailure")
fun <T> showWhenFailure(view: View, networkState: NetworkState<T>?) {
    view.isVisible = networkState is NetworkState.OnFailure
}

//@BindingAdapter(value = ["app:items"])
//fun <T> setRecyclerItems(view: RecyclerView, items: List<T>?) {
//    if (items != null) {
//        (view.adapter as BaseMarvelAdapter<T>?)?.setItems(items)
//    } else {
//        (view.adapter as BaseMarvelAdapter<T>?)?.setItems(emptyList())
//    }
//}

//@BindingAdapter(value = ["app:showImage"])
//fun setImage(view: ImageView, url:String?){
//    view.load(url){
//        placeholder(R.drawable.ic_placeholder_image)
//    }
//}

