package com.example.myapplication

data class ModelPoster(val image : Int, val description: String)





object MockList {

    fun getModel(): List<ModelPoster> {


        val itemModel1 = ModelPoster(
            R.drawable.family,
            "Lord Of The Rings",
        )

        val itemModel2 = ModelPoster(
            R.drawable.freelance,
            "Harry Potter",
        )


        val itemList: ArrayList<ModelPoster> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)



        return itemList
    }

}