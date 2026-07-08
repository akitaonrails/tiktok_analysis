package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class DMAvatarLoadConfig {

    @C09CT("event_sample_rate")
    public final int eventSampleRate;

    @C09CT("log_sample_rate")
    public final int logSampleRate;

    @C09CT("use_empty_placeholder")
    public final boolean useEmptyPlaceholder;

    @C09CT("use_strict_uri")
    public final boolean useStrictUri;

    public DMAvatarLoadConfig() {
        this(5, 5, false, false);
    }

    public DMAvatarLoadConfig(int i, int i2, boolean z, boolean z2) {
        this.eventSampleRate = i;
        this.logSampleRate = i2;
        this.useStrictUri = z;
        this.useEmptyPlaceholder = z2;
    }
}
