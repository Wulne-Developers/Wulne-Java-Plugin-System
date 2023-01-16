package xu.zhixuan.wulne.Util.Client

import java.io.InputStream
import java.util.*

object FileUtil {
    fun readResource(inputStream: InputStream): String {
        val scanner = Scanner(inputStream)
        val stringBuilder = StringBuilder()
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.next() + "\n")
        }
        return stringBuilder.toString()
    }
}