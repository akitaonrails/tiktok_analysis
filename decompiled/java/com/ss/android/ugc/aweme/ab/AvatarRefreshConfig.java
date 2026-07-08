package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarRefreshConfig implements Serializable {

    @C09CT("animation_duration_1")
    public final long animationDurationV1;

    @C09CT("animation_duration_2")
    public final long animationDurationV2;

    @C09CT("animation_type")
    public final int animationType;

    @C09CT("delay_ms")
    public final long delayMs;

    @C09CT("main_enable")
    public final boolean mainEnable;

    @C09CT("refresh_interval")
    public final int refreshInterval;

    @C09CT("refresh_top")
    public final int refreshTop;

    public AvatarRefreshConfig() {
        this(false, 1, 0, 0L, 180, 400L, 600L);
    }

    public AvatarRefreshConfig(boolean z, int i, int i2, long j, int i3, long j2, long j3) {
        this.mainEnable = z;
        this.animationType = i;
        this.refreshTop = i2;
        this.delayMs = j;
        this.refreshInterval = i3;
        this.animationDurationV1 = j2;
        this.animationDurationV2 = j3;
    }
}
