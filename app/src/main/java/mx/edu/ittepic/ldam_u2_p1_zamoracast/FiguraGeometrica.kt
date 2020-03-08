package mx.edu.ittepic.ldam_u2_p1_zamoracast

import android.graphics.Canvas
import android.graphics.Paint
import android.view.ViewTreeObserver

class FiguraGeometrica() {
    var lineaAncho = 0f
    var lineaaltura = 0f
    var x = 0f
    var y = 0f
    var tipo = 1
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var bajarx = 1
    var bajary = 1

    constructor(x: Int, y: Int, radio: Int) : this() {//circulo

        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()


    }

    constructor(x: Int, y: Int, ancho: Int, alto: Int) : this() {//Rectangulo

        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2

    }


    fun pintar(c: Canvas, p: Paint) {
        when (tipo) {
            1 -> {
                c.drawCircle(x, y, radio, p)
            }
            2 -> {
                c.drawRect(x, y, x + ancho, y + alto, p)
            }
        }
    }


    fun nieve(alto: Int) {
        y += bajary
        if (y <= -50 || y >= alto) {
            y = 0f
        }
    }

    fun viento(ancho: Int) {

        if (x >= 0 || x <= ancho) {
            x += bajarx

        }
    }
}




