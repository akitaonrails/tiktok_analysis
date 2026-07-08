package com.bytedance.android.livesdk.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class SkylightBackupDataConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("filter_strategy")
    public int filterStrategy;

    @C09CT("max_size")
    public int maxSize;

    static {
        NormalGson.singleton();
        ADAPTER = new SkylightBackupDataConfig_OptTypeAdapter();
    }

    public SkylightBackupDataConfig() {
        this(2, 600000L, 0);
    }

    public SkylightBackupDataConfig(int i, long j, int i2) {
        this.maxSize = i;
        this.expireTime = j;
        this.filterStrategy = i2;
    }
}
