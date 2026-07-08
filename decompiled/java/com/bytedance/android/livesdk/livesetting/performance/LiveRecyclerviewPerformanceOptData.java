package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRecyclerviewPerformanceOptData {
    public static final TypeAdapter ADAPTER = new LiveRecyclerviewPerformanceOptData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("other")
    public boolean other;

    @C09CT("reuse_pool")
    public boolean reusePool;

    @C09CT("viewholder_layout_preload")
    public boolean viewHolderLayoutPreload;

    public LiveRecyclerviewPerformanceOptData() {
        this(false, false, false);
    }

    public LiveRecyclerviewPerformanceOptData(boolean z, boolean z2, boolean z3) {
        this.viewHolderLayoutPreload = z;
        this.reusePool = z2;
        this.other = z3;
    }
}
