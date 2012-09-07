package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class PlayerMoneyAskEvent extends PlayerEvent
{
  private static final HandlerList handlers = new HandlerList();
  private float money;

  public PlayerMoneyAskEvent(float money, Player who)
  {
    super(who);
    this.money = money;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public void setMoney(float money) {
    this.money = money;
  }

  public float getMoney() {
    return this.money;
  }

  public HandlerList getHandlers()
  {
    return handlers;
  }
}