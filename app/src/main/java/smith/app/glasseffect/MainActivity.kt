package smith.app.glasseffect

import android.animation.ObjectAnimator
import android.graphics.Interpolator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Property
import android.view.animation.LinearInterpolator
import smith.app.glasseffect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val x = binding.shine.translationX
        val objectAnimator = ObjectAnimator.ofFloat(binding.shine, "translationX", x, x * -3)
        objectAnimator.interpolator = LinearInterpolator()
        objectAnimator.repeatCount = -1
        objectAnimator.duration = 4000
        objectAnimator.start()
    }
}