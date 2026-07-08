package com.ss.android.ugc.aweme.ecommercebase.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomPerfMonitorSwitchConfig {

    @C09CT("draw_listener")
    public final boolean drawListener;

    @C09CT("start_click_time")
    public final boolean startClickTime;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final boolean f63switch;

    @C09CT("thread_free_check")
    public final boolean threadFreeCheck;

    public EcomPerfMonitorSwitchConfig() {
        this(false, false, false, false);
    }

    public EcomPerfMonitorSwitchConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f63switch = z;
        this.threadFreeCheck = z2;
        this.drawListener = z3;
        this.startClickTime = z4;
    }
}
