package com.aem.im.playertracker;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "player-tracker", name = "Player Tracker", version = "1.0")
public class PlayerTracker {

    @Listener
    public void onServerStart(GameStartedServerEvent evt) {
        System.out.println("Hello World!");
    }

    @Listener
    public void onPlayerJoin(ClientConnectionEvent evt) {
        System.out.println("ClientConnectionEvent occurred");
        System.out.println(evt.toString());
    }
}
