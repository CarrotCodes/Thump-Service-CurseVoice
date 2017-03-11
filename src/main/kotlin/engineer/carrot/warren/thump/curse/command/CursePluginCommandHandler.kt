package engineer.carrot.warren.thump.curse.command

import engineer.carrot.warren.thump.api.ICommandHandler
import net.minecraft.command.ICommandSender

class CursePluginCommandHandler : ICommandHandler {
    override fun getCommand() = "curse"
    override fun getUsage() = "$command ???"

    override fun processParameters(sender: ICommandSender, parameters: Array<String>) {

    }

    override fun addTabCompletionOptions(sender: ICommandSender, parameters: Array<String>): List<String> {
        return listOf()
    }

}