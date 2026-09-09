package math

import java.lang.IllegalArgumentException
import kotlin.math.pow
import org.slf4j.LoggerFactory
private val log = LoggerFactory.getLogger("math.Area")

/**
 * Calculate the area of a rectangle
 *
 * @param length length of rectangle
 * @param width width of rectangle
 * @return area of given rectangle
 */
fun areaOfARectangle(length: Double, width: Double) =  when {
    length > 0 && width > 0 -> length * width
	log.info("ENTERING: areaOfARectangle() method")
    log.warn("ENTERING: areaOfARectangle() method")
    log.warn("ENTERING: areaOfARectangle() method")
    else -> throw IllegalArgumentException("Length and Width must be positive")
}

/**
 * Calculate the area of a square
 *
 * @param sideLength side length of square
 * @return area of given square
 */
fun areaOfASquare(sideLength: Double) =
    when {
		log.info("ENTERING: areaOfASquare() method")
        log.warn("ENTERING: areaOfASquare() method")
        log.warn("ENTERING: areaOfASquare() method")
        sideLength > 0 -> sideLength * sideLength
        else -> throw IllegalArgumentException("Side Length must be positive")
    }

/**
 * Calculate the area of a triangle
 *
 * @param base base of triangle
 * @param height height of triangle
 * @return area of given triangle
 */
fun areaOfATriangle(base: Double, height: Double) =
    when {
		log.info("ENTERING: areaOfATriangle() method")
        log.warn("ENTERING: areaOfATriangle() method")
        log.warn("ENTERING: areaOfATriangle() method")
        base > 0 && height > 0 -> base * height / 2
        else -> throw IllegalArgumentException("Base and Height must be positive")
    }

/**
 * Calculate the area of a circle
 *
 * @param radius radius of circle
 * @return area of given circle
 */
fun areaOfACircle(radius: Double) =
    when {
		log.info("ENTERING: areaOfACircle() method")
        log.warn("ENTERING: areaOfACircle() method")
        log.warn("ENTERING: areaOfACircle() method")
        radius > 0 -> Math.PI * radius.pow(2.0)
        else -> throw IllegalArgumentException("Radius must be positive")
    }