package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class RivalSectionExtraConfig {
    public static final TypeAdapter ADAPTER = new RivalSectionExtraConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_cohost_friend_online_append")
    public boolean enableFriendOnlineAppend;

    @C09CT("invalid_percentage")
    public int invalidPercentage;

    @C09CT("refresh_interval")
    public long refreshInterval;

    @C09CT("refresh_times")
    public int refreshTimes;

    public RivalSectionExtraConfig() {
        this(0, 0L, false, 0);
    }

    public RivalSectionExtraConfig(int i, long j, boolean z, int i2) {
        this.refreshTimes = i;
        this.refreshInterval = j;
        this.enableFriendOnlineAppend = z;
        this.invalidPercentage = i2;
    }
}
