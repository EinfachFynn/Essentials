package de.netzguru0815;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class Essentials extends JavaPlugin {

    @Getter
    private static Essentials instance;

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {

    }
}
