package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import X.C0CMJ;
import X.EnumC695670RQn;

/* JADX INFO: loaded from: classes12.dex */
public final class ComponentStrategy {

    @C09CT("idle_trigger")
    public final boolean idleTrigger;

    @C09CT("ignore_surface_view")
    public final boolean ignoreSurfaceView;

    @C09CT("lazy_mode")
    public final int lazyMode;

    @C09CT("priority")
    public final int priority;

    @C09CT("tag")
    public final String tag;

    @C09CT("timeout_duration")
    public final Long timeoutDuration;

    public ComponentStrategy() {
        this("", C0CMJ.HIGH_PRIORITY.getType(), EnumC695670RQn.NEVER_LAZY.ordinal(), null, false, false);
    }

    public ComponentStrategy(String str, int i, int i2, Long l, boolean z, boolean z2) {
        this.tag = str;
        this.priority = i;
        this.lazyMode = i2;
        this.timeoutDuration = l;
        this.idleTrigger = z;
        this.ignoreSurfaceView = z2;
    }
}
