package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;
import X.C1930507hH;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class CleanModel {

    @C09CT("clean_alog")
    public final boolean cleanALog;

    @C09CT("clean_apm")
    public final boolean cleanApm;

    @C09CT("clean_npth")
    public final boolean cleanNpth;

    @C09CT("clean_sdk_monitor")
    public final boolean cleanSdkMonitor;

    public CleanModel() {
        this(false, false, false, false, 15, null);
    }

    public CleanModel(boolean z, boolean z2, boolean z3, boolean z4) {
        this.cleanALog = z;
        this.cleanApm = z2;
        this.cleanNpth = z3;
        this.cleanSdkMonitor = z4;
    }

    public CleanModel(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1930507hH.LIZ : z, (i & 2) != 0 ? C1930507hH.LIZ : z2, (i & 4) != 0 ? C1930507hH.LIZ : z3, (i & 8) != 0 ? C1930507hH.LIZ : z4);
    }
}
