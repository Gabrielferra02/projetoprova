package com.example.projetoprova

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class sensor1 : AppCompatActivity(), SensorEventListener {

    private lateinit var sensorManager: SensorManager
    private var luzSensor: Sensor? = null
    private lateinit var textoLuminosidade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor1)

        textoLuminosidade = findViewById(R.id.TextLuminosiade)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        luzSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)

        if (luzSensor == null) {
            textoLuminosidade.text = "Este dispositivo não possui sensor de luz!"
        }
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null && event.sensor.type == Sensor.TYPE_LIGHT) {
            val valorLux = event.values[0] // O primeiro valor do array é a luminosidade em lux
            textoLuminosidade.text = "Luminosidade atual: $valorLux"


            when (valorLux) {
                in 0.0..10.0 -> {  }
                else -> {  }
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    // 4.
    override fun onResume() {
        super.onResume()
        luzSensor?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    // 5.
    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(this)
    }
}