package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ExplorePreConnectConfig {

    @C09CT("is_enable")
    public final boolean enable;

    @C09CT("is_cold_start_enable")
    public final boolean isColdStartEnable;

    @C09CT("pre_connect_domain")
    public final List<String> preConnectDomain;

    public ExplorePreConnectConfig() {
        this(false, false, null, 7, null);
    }

    public final boolean isColdStartEnable() {
        return this.isColdStartEnable;
    }

    public ExplorePreConnectConfig(boolean z, boolean z2, List<String> list) {
        this.enable = z;
        this.isColdStartEnable = z2;
        this.preConnectDomain = list;
    }

    public ExplorePreConnectConfig(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
