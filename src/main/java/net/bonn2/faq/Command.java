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
                        .setDescription("Vectorio saves end in `.sav` and should be located at:")
                        .addField(
                                "Windows",
                                """
                                        ```%appdata%/../LocalLow/Vectorio Remake/Vectorio Remake/World Saves/Live/```
                                        """,
                                true
                        )
                        .addField(
                                "Linux",
                                """
                                        ```~/.config/unity3d/Vectorio Remake/Vectorio Remake/World Saves/Live/```
                                        """,
                                true
                        )
                        .addField(
                                "Mac",
                                """
                                        ```~/Library/Application Support/Vectorio Remake/Vectorio Remake/World Saves/Live/```
                                        """,
                                true
                        )
                        .addField(
                                "Identifying saves",
                                """
                                        Saves are named world_`i`.sav, where `i` is a counter, usually your oldest save is `1`
                                        **Back up** your save **before** doing this! You might accidentally delete something you shouldn't have.
                                        1. Copy a save that you think could be the one you're looking for
                                        2. Rename it from world_i.sav to world_i.gz. if you can't see the .sav extensions at the end of the name, turn on "file extensions" in your browser.
                                        3. Right-click and extract/open it with a tool like 7Zip or WinZip, and you should see a new file with no extension, named the same as the save file is.
                                        4. Open this file in a text editor
                                        5. Use the Find shortcut, usually CTRL+F, and search for `Name:`
                                        6. Your save file's name should be there.""",
                                false
                        )
                        .setFooter("Thanks @com2486 for helping write this!")
                        .build()
        )).build()).queue();
    }
}
