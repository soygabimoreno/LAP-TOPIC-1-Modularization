package soy.gabimoreno.modulecall

import soy.gabimoreno.moduleinterface.ModuleInterface

fun getModuleInfo(moduleInterface: ModuleInterface): String {
    return moduleInterface.getModuleInfo()
}
