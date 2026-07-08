package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class ProfileComponentConfig {

    @C09CT("dismiss_after_show_duration")
    public final int dismissAfterShowDuration;

    @C09CT("show_after_watch_duration")
    public final int showAfterWatchDuration;

    public ProfileComponentConfig() {
        this(20, 30);
    }

    public ProfileComponentConfig(int i, int i2) {
        this.showAfterWatchDuration = i;
        this.dismissAfterShowDuration = i2;
    }
}
