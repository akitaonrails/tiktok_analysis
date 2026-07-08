package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class WatchReasonConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("inner_count")
    public int innerCount;

    @C09CT("inner_time")
    public int innerTime;

    @C09CT("preview_count")
    public int previewCount;

    @C09CT("preview_time")
    public int previewTime;

    @C09CT("sub_title_delay")
    public long subTitleDelay;

    @C09CT("sub_title_duration")
    public long subTitleDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new WatchReasonConfig_OptTypeAdapter();
    }

    public WatchReasonConfig() {
        this(0, 0, 2000L, 10000L, 0, 0);
    }

    public WatchReasonConfig(int i, int i2, long j, long j2, int i3, int i4) {
        this.previewTime = i;
        this.previewCount = i2;
        this.subTitleDelay = j;
        this.subTitleDuration = j2;
        this.innerTime = i3;
        this.innerCount = i4;
    }
}
