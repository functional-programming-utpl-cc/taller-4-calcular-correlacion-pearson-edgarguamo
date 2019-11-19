// Taller 19/11/19 coeficiente de correlación de Pearson

val tabla = List ((72, 115), (76, 121), (78,125), (81, 130), (89, 141),
  (95, 150), (108, 165), (115, 170), (120, 177), (130, 178))

val xMarginal = (tabla: List[(Int, Int)]) => tabla.map(x => x._1).sum / tabla.length.toFloat
val yMarginal = (tabla: List[(Int, Int)]) => tabla.map(x => x._2).sum / tabla.length.toFloat

val xDesv = (tabla: List[(Int, Int)]) => math.sqrt((tabla.map(x=> math.pow(x._1,2)).sum)/
  tabla.length -
  math.pow(xMarginal(tabla),2))
val yDesv = (tabla: List[(Int, Int)]) => math.sqrt((tabla.map(x=> math.pow(x._2,2)).sum)/
  tabla.length -
  math.pow(yMarginal(tabla),2))

val covarianza = (tabla: List[(Int, Int)]) => (tabla.map(x => x._1 * x._2).sum /
  tabla.length)- xMarginal(tabla)* yMarginal(tabla)
val pearson = covarianza(tabla) / (xDesv(tabla) * yDesv(tabla))




