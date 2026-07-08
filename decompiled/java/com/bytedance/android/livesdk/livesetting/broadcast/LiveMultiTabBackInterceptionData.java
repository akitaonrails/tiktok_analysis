package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMultiTabBackInterceptionData {
    public static final TypeAdapter ADAPTER = new LiveMultiTabBackInterceptionData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_back_interception")
    public boolean enableBackInterception;

    @C09CT("enable_apply_permission_optimize")
    public boolean enablePermissionOptimize;

    @C09CT("interval")
    public long interval;

    public LiveMultiTabBackInterceptionData() {
        this(true, 2000L, true);
    }

    public LiveMultiTabBackInterceptionData(boolean z, long j, boolean z2) {
        this.enableBackInterception = z;
        this.interval = j;
        this.enablePermissionOptimize = z2;
    }
}
