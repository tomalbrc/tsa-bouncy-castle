package de.tomalbrc.tsaBouncyCastle;

import com.mojang.logging.LogUtils;
import de.tomalbrc.filament.api.FilamentLoader;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class TsaBouncyCastle implements ModInitializer {
    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        try {
            FilamentLoader.loadBlocks("tsa-bouncy-castle");
            PolymerResourcePackUtils.addModAssets("tsa-bouncy-castle");
            PolymerResourcePackUtils.markAsRequired();
        } catch (Exception e) {
            LOGGER.error("Could not load some files!");
            e.printStackTrace();
        }
    }
}
