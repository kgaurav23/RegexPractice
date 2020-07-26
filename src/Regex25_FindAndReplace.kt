import java.io.File
import java.util.regex.Pattern


// Reading a file from Kotlin: https://www.baeldung.com/kotlin-read-file

fun main() {

    // The regex pattern
    val REGEX_PATTERN = "([0-9]+)x([0-9]+)"
    val inputFileName = "input/regex25.txt"
    // Create a Pattern object
    val r = Pattern.compile(REGEX_PATTERN)

    // Read the input file line by line
    val text = readFileAsLinesUsingBufferedReader(inputFileName)
    var line1: String?
    for (line in text) {
        // Now create matcher object.
        val m = r.matcher(line)

        // Apply the regex pattern to each line
        // If pattern matches, perform replacement on the current line.
        if (m.find()) {
            line1 = m.replaceAll(m.group(1) + " pix by " + m.group(2) + " pix")
            System.out.println(line1)
        }
    }
}

fun readFileAsLinesUsingBufferedReader25(fileName: String): List<String> = File(fileName).bufferedReader().readLines()