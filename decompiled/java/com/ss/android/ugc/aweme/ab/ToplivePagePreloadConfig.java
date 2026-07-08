package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class ToplivePagePreloadConfig {

    @C09CT("enabled")
    public final boolean enable;

    @C09CT("start_delay_android")
    public final int startDelay;

    @C09CT("valid_duration")
    public final int validDuration;

    public ToplivePagePreloadConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.startDelay = i;
        this.validDuration = i2;
    }
}
