package org.bukkit.entity;

public interface ChevalBlanc extends Animals, Vehicle {

	/**
     * Check if the pig has a saddle.
     *
     * @return if the pig has been saddled.
     */
    public boolean getSaddle();

    /**
     * Sets if the pig has a saddle or not
     *
     * @param saddled set if the pig has a saddle or not.
     */
    public void setSaddle(boolean saddled);
	
}
