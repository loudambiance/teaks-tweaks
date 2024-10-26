package me.teakivy.teakstweaks.packs.realtimeclock;

import me.teakivy.teakstweaks.commands.RealTimeClockCommand;
import me.teakivy.teakstweaks.packs.BasePack;
import me.teakivy.teakstweaks.packs.PackType;
import org.bukkit.Material;

public class RealTimeClock extends BasePack {

        public RealTimeClock() {
            super("real-time-clock", PackType.SURVIVAL, Material.CLOCK, new RealTimeClockCommand());
        }
}
