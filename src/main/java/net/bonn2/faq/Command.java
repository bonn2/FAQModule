package net.bonn2.faq;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.messages.MessageCreateBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Command extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if (!event.getName().equals("saves")) return;
        event.reply(new MessageCreateBuilder().addEmbeds(List.of(
                new EmbedBuilder()
                        .setTitle("How to find your saves")
                        .setDescription("Vectorio saves end in `.sav`")
                        .addField(
                                "Windows",
                                """
                                        They are located in:
                                         `C:\\Users\\<user>\\AppData\\LocalLow\\Vectorio Remake\\Vectorio Remake\\Saves`
                                        You can get there quickly by:
                                        1. Pressing `Win+R`
                                        2. Pasting in `%appdata%/../LocalLow/Vectorio Remake/Vectorio Remake/Saves`
                                        3. Pressing `Enter`
                                        4. Selecting the game mode you want to view""",
                                true
                        )
                        .build()
        )).build()).queue();
    }
}
