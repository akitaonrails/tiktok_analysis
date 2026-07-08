package com.ss.android.ugc.gamora.recorder;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class DelayMinorComponentConfig {

    @C09CT("black_list")
    public final List<String> blackList;

    @C09CT("enable")
    public final boolean enable;

    public DelayMinorComponentConfig() {
        this(false, null, 3, null);
    }

    public DelayMinorComponentConfig(boolean z, List<String> list) {
        this.enable = z;
        this.blackList = list;
    }

    public DelayMinorComponentConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
