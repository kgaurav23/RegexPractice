import java.io.File
import java.util.regex.Pattern

// Reading a file from Kotlin: https://www.baeldung.com/kotlin-read-file

fun main() {

    // The regex pattern
    val REGEX_PATTERN = "^fooa+bar$"
    val inputFileName = "input/regex22.txt"
    // Create a Pattern object
    val r = Pattern.compile(REGEX_PATTERN)

    val text = readFileAsLinesUsingBufferedReader22(inputFileName)
    for (line in text) {
        // Now create matcher object.
        val m = r.matcher(line)

        // Apply the regex pattern to each line
        // If pattern matches, output the current line.
        if (m.find()) {
            println(line)
        }
    }
}

fun readFileAsLinesUsingBufferedReader22(fileName: String): List<String> = File(fileName).bufferedReader().readLines()