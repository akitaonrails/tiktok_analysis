package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveCardUpdateConfig {

    @C09CT("check_type")
    public final int checkType;

    @C09CT("interval_count")
    public final int distance;

    @C09CT("feed_list_opt")
    public final boolean feedListOpt;

    @C09CT("server_frequency_control")
    public final int frequencyControl;

    @C09CT("gap0_edge_opt")
    public final int gap0EdgeOpt;

    @C09CT("gap0_opt")
    public final boolean gap0Opt;

    @C09CT("gap_block")
    public final int gapBlock;

    @C09CT("main_enable")
    public final boolean mainEnable;

    @C09CT("page_leave_handle")
    public final boolean pageLeaveHandle;

    @C09CT("scroll_state_block")
    public final boolean scrollStateBlock;

    @C09CT("server_update_enable")
    public final boolean serverReplace;

    @C09CT("update_when_count_diff")
    public final boolean updateWhenCountDiff;

    public LiveCardUpdateConfig() {
        this(false, false, true, 0, false, 3, 0, 0, 0, true, true, true);
    }

    public LiveCardUpdateConfig(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, boolean z5, boolean z6, boolean z7) {
        this.mainEnable = z;
        this.serverReplace = z2;
        this.updateWhenCountDiff = z3;
        this.frequencyControl = i;
        this.scrollStateBlock = z4;
        this.distance = i2;
        this.checkType = i3;
        this.gapBlock = i4;
        this.gap0EdgeOpt = i5;
        this.gap0Opt = z5;
        this.feedListOpt = z6;
        this.pageLeaveHandle = z7;
    }
}
