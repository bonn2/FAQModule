package net.bonn2.faq;

import net.bonn2.Bot;
import net.bonn2.modules.Module;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class Main extends Module {

    @Override
    public void registerLoggingChannels() {
    }

    @Override
    public void registerSettings() {
    }

    @Override
    public void load() {
        Bot.jda.addEventListener(new Command());
    }

    @Override
    public CommandData[] getCommands() {
        return new CommandData[] {
                Commands.slash(
                        "saves",
                        "Say where to find saves"
                )
        };
    }
}