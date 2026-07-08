package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class SurfaceViewConfig {

    @C09CT("delay_release")
    public final boolean delayRelease;

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("settings")
    public final Map<String, Boolean> settings;

    public SurfaceViewConfig() {
        this(false, new HashMap(), false, 100L);
    }

    public SurfaceViewConfig(boolean z, Map<String, Boolean> map, boolean z2, long j) {
        this.enable = z;
        this.settings = map;
        this.delayRelease = z2;
        this.delayTime = j;
    }
}
