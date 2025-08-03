package com.anas.affirmation.data

import com.anas.affirmation.R
import com.anas.affirmation.model.Affirmation

class Datasource () {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation_1 , R.drawable.affirmation_image_1),
            Affirmation(R.string.affirmation_2 , R.drawable.affirmation_image_2),
            Affirmation(R.string.affirmation_3 , R.drawable.affirmation_image_3),
            Affirmation(R.string.affirmation_4 , R.drawable.affirmation_image_4),
            Affirmation(R.string.affirmation_5 , R.drawable.affirmation_image_5),
            Affirmation(R.string.affirmation_6 , R.drawable.affirmation_image_6),
            Affirmation(R.string.affirmation_7 , R.drawable.affirmation_image_7),
            Affirmation(R.string.affirmation_8 , R.drawable.affirmation_image_8),
            Affirmation(R.string.affirmation_9 , R.drawable.affirmation_image_9),
            Affirmation(R.string.affirmation_10 , R.drawable.affirmation_image_10)
        )
    }
}