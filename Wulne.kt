package xu.zhixuan.wulne

import xu.zhixuan.wulne.Api.plugin.PluginManager

object Wulne {
    lateinit var pluginManager: PluginManager

    fun onInit() {
        println("Starting")
        pluginManager = PluginManager()
    }

    fun onStart() {
    }

    fun onStop() {
        println("Stopping")
    }
}