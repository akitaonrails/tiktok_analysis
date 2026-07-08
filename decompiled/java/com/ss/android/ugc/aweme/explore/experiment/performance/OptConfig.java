package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class OptConfig {

    @C09CT("disable_animator")
    public final boolean disableAnimator;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_pre_create_power_cell_item")
    public final boolean enablePreCreateCell;

    @C09CT("enable_tab_selected_delay")
    public final boolean enableTabSelectedDelay;

    @C09CT("event_bus_register_delay_mills")
    public final long eventBusRegisterDelayMills;

    @C09CT("max_preload_item_size")
    public final int maxPreloadItemSize;

    @C09CT("tab_change_delay_time_mills")
    public final long tabChangeDelayTimeMills;

    public OptConfig() {
        this(false, false, false, 0, 0L, true, 500L);
    }

    public OptConfig(boolean z, boolean z2, boolean z3, int i, long j, boolean z4, long j2) {
        this.enable = z;
        this.disableAnimator = z2;
        this.enablePreCreateCell = z3;
        this.maxPreloadItemSize = i;
        this.tabChangeDelayTimeMills = j;
        this.enableTabSelectedDelay = z4;
        this.eventBusRegisterDelayMills = j2;
    }
}
