package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryWeakNetworkImageWebpConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("speed_threshold_kbps")
    public final int speedThresholdKbps;

    @C09CT("use_webp_on_weak_network")
    public final boolean useWebpOnWeakNetwork;

    @C09CT("weak_network_compress_quality")
    public final int weakNetworkCompressQuality;

    public StoryWeakNetworkImageWebpConfig() {
        this(false, 0, false, 0);
    }

    public StoryWeakNetworkImageWebpConfig(boolean z, int i, boolean z2, int i2) {
        this.enable = z;
        this.speedThresholdKbps = i;
        this.useWebpOnWeakNetwork = z2;
        this.weakNetworkCompressQuality = i2;
    }
}
