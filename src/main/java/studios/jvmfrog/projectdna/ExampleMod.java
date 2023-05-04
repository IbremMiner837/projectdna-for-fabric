package studios.jvmfrog.projectdna;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import studios.jvmfrog.projectdna.items.Blood;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("projectdna");

    public static final Item BLOOD_ITEM = new Blood(null);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
    
        Registry.register(Registry.ITEM, new Identifier("projectdna", "blood"), BLOOD_ITEM);
    }
}