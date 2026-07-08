package com.ss.android.ugc.aweme.legoImp.task.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class PowerListTrackerUploadRate {
    public static final int $stable = 0;

    @C09CT("powerlist_bind_performance")
    public final float bindPerformance;

    @C09CT("powerlist_create_performance")
    public final float createPerformance;

    @C09CT("powerlist_list_diff")
    public final float listDiff;

    @C09CT("powerlist_list_drop")
    public final float listDrop;

    @C09CT("powerlist_list_fps")
    public final float listFpsRate;

    @C09CT("powerlist_list_layout")
    public final float listLayout;

    @C09CT("powerlist_list_page_load")
    public final float pageLoad;

    public PowerListTrackerUploadRate() {
        this(5.0E-4f, 5.0E-4f, 5.0E-5f, 1.0E-5f, 1.0E-5f, 1.0E-5f, 1.0E-5f);
    }

    public PowerListTrackerUploadRate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.listFpsRate = f;
        this.listDrop = f2;
        this.listDiff = f3;
        this.createPerformance = f4;
        this.bindPerformance = f5;
        this.pageLoad = f6;
        this.listLayout = f7;
    }
}
