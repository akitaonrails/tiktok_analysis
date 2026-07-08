package com.bytedance.geckox;

import com.bytedance.geckox.policy.lazy.BlockLazyUpdateSettings;
import com.bytedance.geckox.policy.meta.ChannelMetaDataReportSettings;
import com.bytedance.geckox.policy.meta.file.ChannelFileRecordSettings;
import com.bytedance.geckox.settings.model.GeckoSSCConfigs;
import com.bytedance.geckox.settings.model.WaitGeckoSettingsConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class AppSettingsManager {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public volatile Map<String, String> LIZJ;
    public volatile Map<String, ArrayList<String>> LIZLLL;
    public volatile Map<String, List<String>> LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public ChannelFileRecordSettings LJIIJJI;
    public ChannelMetaDataReportSettings LJIIL;
    public boolean LJIILIIL;
    public WaitGeckoSettingsConfig LJIILJJIL;
    public BlockLazyUpdateSettings LJIILL;
    public boolean LJIILLIIL;
    public GeckoSSCConfigs LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public Map<String, String> LJIJJ;

    public interface IGeckoAppSettings {
        boolean LIZ();
    }

    public static boolean LIZIZ() {
        IGeckoAppSettings iGeckoAppSettings = (IGeckoAppSettings) PluggableExtentionKt.pluggableSpiForReal(IGeckoAppSettings.class);
        return iGeckoAppSettings != null && iGeckoAppSettings.LIZ();
    }

    public final ChannelFileRecordSettings LIZ() {
        ChannelFileRecordSettings channelFileRecordSettings = this.LJIIJJI;
        return channelFileRecordSettings == null ? new ChannelFileRecordSettings() : channelFileRecordSettings;
    }
}
