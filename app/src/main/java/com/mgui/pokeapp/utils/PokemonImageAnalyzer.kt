package com.mgui.pokeapp.utils
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import com.mgui.pokeapp.data.Pokemon
import com.mgui.pokeapp.data.PokemonClassifier

class PokemonImageAnalyzer(
    private val classifier: PokemonClassifier,
    private val onResults: (List<Pokemon>) -> Unit
): ImageAnalysis.Analyzer {

    private var frameSkipCounter = 0

    override fun analyze(image: ImageProxy) {
        if(frameSkipCounter % 60 == 0) {
            val rotationDegrees = image.imageInfo.rotationDegrees
            val bitmap = image
                .toBitmap()

            val results = classifier.classify(bitmap, rotationDegrees)
            onResults(results)
        }
        frameSkipCounter++

        image.close()
    }
}