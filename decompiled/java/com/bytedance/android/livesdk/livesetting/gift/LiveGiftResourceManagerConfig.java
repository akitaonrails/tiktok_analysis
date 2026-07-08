package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftResourceManagerConfig {
    public static final TypeAdapter ADAPTER = new LiveGiftResourceManagerConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("resource_disk_control_line_tier1")
    public long diskRedLine;

    @C09CT("resource_disk_control_line_tier1_batch_asset")
    public long diskRedLineForBatchAsset;

    @C09CT("resource_disk_control_line_tier2")
    public long diskYellowLine;

    @C09CT("resource_disk_control_line_tier2_batch_asset")
    public long diskYellowLineForBatchAsset;

    @C09CT("enable_delete_all_resources")
    public boolean enableDeleteAllResource;

    @C09CT("enable_delete_unused_resources")
    public boolean enableDeleteUnusedResource;

    @C09CT("resource_disk_limitation_enable")
    public boolean resourceDiskLimitationEnable;

    @C09CT("resource_expire_duration")
    public int resourceExpireDuration;

    @C09CT("resource_preload_strategy")
    public int resourcePreloadStrategy;

    @C09CT("thread_crash_fix")
    public boolean threadCrashFix;

    public LiveGiftResourceManagerConfig() {
        this(0, 259200, true, 51200L, 102400L, 51200L, 102400L, true, true, true);
    }

    public LiveGiftResourceManagerConfig(int i, int i2, boolean z, long j, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4) {
        this.resourcePreloadStrategy = i;
        this.resourceExpireDuration = i2;
        this.resourceDiskLimitationEnable = z;
        this.diskRedLine = j;
        this.diskYellowLine = j2;
        this.diskRedLineForBatchAsset = j3;
        this.diskYellowLineForBatchAsset = j4;
        this.enableDeleteUnusedResource = z2;
        this.enableDeleteAllResource = z3;
        this.threadCrashFix = z4;
    }
}
