package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class WwaPreloadChannelConfig {
    public static final int $stable = 8;

    @C09CT("wwa_preload_channels")
    public final List<String> preloadChannels;

    public WwaPreloadChannelConfig() {
        this(C1697810uHb.LJIIJJI("music_promotion_wwa_entrance", "music_promotion_wwa"));
    }

    public WwaPreloadChannelConfig(List<String> list) {
        this.preloadChannels = list;
    }
}
