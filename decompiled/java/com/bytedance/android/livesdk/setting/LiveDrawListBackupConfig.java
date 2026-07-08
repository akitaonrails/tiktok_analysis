package com.bytedance.android.livesdk.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDrawListBackupConfig {
    public static final TypeAdapter ADAPTER = new LiveDrawListBackupConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("request_delay")
    public long requestDelay;

    @C09CT("use_feed_data")
    public boolean useFeedData;

    @C09CT("use_skylight_data")
    public boolean useSkylightData;

    public LiveDrawListBackupConfig() {
        this(false, false, false, 0L);
    }

    public LiveDrawListBackupConfig(boolean z, boolean z2, boolean z3, long j) {
        this.enable = z;
        this.useSkylightData = z2;
        this.useFeedData = z3;
        this.requestDelay = j;
    }
}
