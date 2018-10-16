package tech.central.showcase.photo.controller

import com.airbnb.epoxy.TypedEpoxyController
import tech.central.showcase.base.model.Photo
import tech.central.showcase.photo.controller.model.photo
import javax.inject.Inject

class PhotoController @Inject constructor() : TypedEpoxyController<List<Photo>>() {
    override fun buildModels(data: List<Photo>?) {
        when {
            data == null -> {
            }
            data.isNotEmpty() -> {
                data.forEach {
                    photo {
                        id(it.id)
                        photo(it)
                    }
                }
            }
            else -> {
            }
        }
    }
}