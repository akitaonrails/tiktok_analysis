package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class TimeConfig {

    @C09CT("enable_watch_live_outside_heart")
    public final int enable;

    @C09CT("watch_live_outside_first")
    public final int firstInterval;

    @C09CT("watch_live_outside_heart")
    public final int interval;

    @C09CT("trigger_pre_init_wschannel")
    public final boolean preInitWsChannel;

    public TimeConfig() {
        this(0, -1, -1, false);
    }

    public TimeConfig(int i, int i2, int i3, boolean z) {
        this.enable = i;
        this.firstInterval = i2;
        this.interval = i3;
        this.preInitWsChannel = z;
    }
}
