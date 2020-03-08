package mx.edu.ittepic.ldam_u2_p1_zamoracast

class HiloAnimacion(p: MainActivity) : Thread() {


    var puntero = p

    override fun run() {
        super.run()

        while (true) {

            sleep(8)
            puntero.runOnUiThread {
                puntero.lienzo!!.vientoNube()
                puntero.lienzo!!.caidaNieve()


            }
        }
    }

}