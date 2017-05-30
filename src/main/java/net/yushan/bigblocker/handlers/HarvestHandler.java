package net.yushan.bigblocker.handlers;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by francois.drouin on 5/29/2017.
 */
public class HarvestHandler {
    @SubscribeEvent
    public void HandleHarvestCheck (PlayerEvent.HarvestCheck e){
        System.out.println("Player tried to harvest " + e.getTargetBlock().getBlock().getLocalizedName());
    }
}
