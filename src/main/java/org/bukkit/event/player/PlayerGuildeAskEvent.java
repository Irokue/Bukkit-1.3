package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerGuildeAskEvent extends PlayerEvent
{
  private static final HandlerList handlers = new HandlerList();
  private static String guildeName;
  private String guildeRank;

  public PlayerGuildeAskEvent(String guilde, String guildeRank, Player who)
  {
    super(who);
    guildeName = guilde;
    this.guildeRank = guildeRank;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public String getGuildeRank() {
    return this.guildeRank;
  }

  public void setGuideRank(String guildeRank) {
    this.guildeRank = guildeRank;
  }

  public static void setGuildeName(String guilde) {
    guildeName = guilde;
  }

  public void setGuilde(String guilde) {
    guildeName = guilde;
  }

  public String getGuilde() {
    return guildeName;
  }

  public HandlerList getHandlers()
  {
    return handlers;
  }
}