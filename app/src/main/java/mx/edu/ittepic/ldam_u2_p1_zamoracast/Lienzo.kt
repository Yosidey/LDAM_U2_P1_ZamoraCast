package mx.edu.ittepic.ldam_u2_p1_zamoracast

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p: MainActivity) : View(p) {

    var a = width

    var puntero = p //se requiere en que actobity trabajara
    var piso = FiguraGeometrica(0, 1100, 1100, 1500)

    var casa = FiguraGeometrica(300, 600, 500, 550)
    var teja1 = FiguraGeometrica(250, 570, 600, 30)
    var teja2 = FiguraGeometrica(350, 540, 400, 30)
    var teja3 = FiguraGeometrica(400, 510, 300, 30)
    var teja4 = FiguraGeometrica(450, 480, 200, 30)
    var ventana = FiguraGeometrica(400, 800, 55)
    var puerta = FiguraGeometrica(500, 920, 150, 230)

    var tronco = FiguraGeometrica(70, 920, 70, 180)

    var oja1 = FiguraGeometrica(100, 770, 70)
    var oja2 = FiguraGeometrica(100, 890, 70)

    var copos1 = FiguraGeometrica(100, 100, 30)
    var copos2 = FiguraGeometrica(200, 200, 30)
    var copos3 = FiguraGeometrica(300, 500, 30)
    var copos4 = FiguraGeometrica(400, 300, 30)
    var copos5 = FiguraGeometrica(500, 200, 30)
    var copos6 = FiguraGeometrica(600, 700, 30)
    var copos7 = FiguraGeometrica(700, 200, 30)
    var copos9 = FiguraGeometrica(800, 300, 30)
    var copos8 = FiguraGeometrica(900, 500, 30)
    var copos10 = FiguraGeometrica(1000, 400, 30)
    var copos11 = FiguraGeometrica(1100, 200, 30)
    var copos12 = FiguraGeometrica(1200, 100, 30)

    var nube1 = FiguraGeometrica(100, 100, 50)
    var nube2 = FiguraGeometrica(100, 150, 50)
    var nube3 = FiguraGeometrica(180, 100, 50)
    var nube4 = FiguraGeometrica(180, 150, 50)
    var nube5 = FiguraGeometrica(250, 120, 50)

    var sol = FiguraGeometrica(1080, 0, 100)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.WHITE);
        //piso
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        piso.pintar(canvas, paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(40, 148, 16)
        piso.pintar(canvas, paint)
        //arbol
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        tronco.pintar(canvas, paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(82, 39, 5)
        tronco.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        casa.pintar(canvas, paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(120, 110, 103)
        casa.pintar(canvas, paint)

        //Arbol
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(4, 99, 7)
        paint.strokeWidth = 2f
        oja2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        oja2.pintar(canvas, paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(4, 99, 7)
        paint.strokeWidth = 2f
        oja1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        oja1.pintar(canvas, paint)

        //Casa
        ventana.pintar(canvas, paint)
        puerta.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.rgb(143, 68, 7)
        casa.pintar(canvas, paint)
        paint.style = Paint.Style.FILL

        paint.color = Color.rgb(138, 61, 7)
        teja1.pintar(canvas, paint)
        teja2.pintar(canvas, paint)
        teja3.pintar(canvas, paint)
        teja4.pintar(canvas, paint)
        //Nieve
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 3f
        copos1.pintar(canvas, paint)
        copos2.pintar(canvas, paint)
        copos3.pintar(canvas, paint)
        copos4.pintar(canvas, paint)
        copos5.pintar(canvas, paint)
        copos6.pintar(canvas, paint)
        copos7.pintar(canvas, paint)
        copos8.pintar(canvas, paint)
        copos9.pintar(canvas, paint)
        copos10.pintar(canvas, paint)
        copos11.pintar(canvas, paint)
        copos12.pintar(canvas, paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        paint.strokeWidth = 2f
        copos1.pintar(canvas, paint)
        copos2.pintar(canvas, paint)
        copos3.pintar(canvas, paint)
        copos4.pintar(canvas, paint)
        copos5.pintar(canvas, paint)
        copos6.pintar(canvas, paint)
        copos7.pintar(canvas, paint)
        copos8.pintar(canvas, paint)
        copos9.pintar(canvas, paint)
        copos10.pintar(canvas, paint)
        copos11.pintar(canvas, paint)
        copos12.pintar(canvas, paint)
        //Nubes
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nube1.pintar(canvas, paint)
        nube2.pintar(canvas, paint)
        nube3.pintar(canvas, paint)
        nube4.pintar(canvas, paint)
        nube5.pintar(canvas, paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        nube1.pintar(canvas, paint)
        nube2.pintar(canvas, paint)
        nube3.pintar(canvas, paint)
        nube4.pintar(canvas, paint)
        nube5.pintar(canvas, paint)
        //Sol
        paint.color = Color.rgb(255, 217, 0)
            sol.pintar(canvas, paint)
    }

    fun caidaNieve() {
        copos1.nieve(600)
        copos2.nieve(1100)
        copos3.nieve(550)
        copos4.nieve(550)
        copos5.nieve(550)
        copos6.nieve(550)
        copos7.nieve(550)
        copos8.nieve(550)
        copos9.nieve(550)
        copos10.nieve(1100)
        copos11.nieve(900)
        copos12.nieve(1100)
        invalidate()
    }

    fun vientoNube() {
        nube1.viento(1080)
        nube2.viento(1080)
        nube3.viento(1080)
        nube4.viento(1080)
        nube5.viento(1080)
        invalidate()
    }
}