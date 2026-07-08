package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class TabRecreateConfig {

    @C09CT("bottom_tab_black_list")
    public final List<String> bottomTabBlackList;

    @C09CT("enable_bottom_tab")
    public final boolean enableBottomTab;

    @C09CT("enable_top_tab")
    public final boolean enableTopTab;

    @C09CT("expire_duration")
    public final long expireDuration;

    @C09CT("on_finish_return_fix_enabled")
    public final boolean onFinishReturnFixEnabled;

    @C09CT("restore_tab_white_list")
    public final List<String> restoreTabWhiteList;

    public TabRecreateConfig() {
        this(false, false, false, null, null, 0L, 63, null);
    }

    public TabRecreateConfig(boolean z, boolean z2, boolean z3, List<String> list, List<String> list2, long j) {
        this.onFinishReturnFixEnabled = z;
        this.enableTopTab = z2;
        this.enableBottomTab = z3;
        this.bottomTabBlackList = list;
        this.restoreTabWhiteList = list2;
        this.expireDuration = j;
    }

    public TabRecreateConfig(boolean z, boolean z2, boolean z3, List list, List list2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) == 0 ? z3 : false, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? C13BV.INSTANCE : list2, (i & 32) != 0 ? 180000L : j);
    }
}
