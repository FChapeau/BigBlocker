package net.yushan.bigblocker.handlers;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by francois.drouin on 5/29/2017.
 */
public class HarvestHandler {
    @SubscribeEvent
    public void HandleBreakSpeedEvent (PlayerEvent.BreakSpeed e){
        System.out.println("Player tried to harvest " + e.getState().getBlock().getLocalizedName());
    }

    @SubscribeEvent
    public void HandleBreakEvent (BlockEvent.BreakEvent e){
        System.out.println("Block broken");
    }
}
