package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveEnterRoomConfig {
    public static final TypeAdapter ADAPTER = new TopLiveEnterRoomConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("cancel_feed")
    public boolean cancelFeed;

    @C09CT("cancel_task")
    public boolean cancelTask;

    @C09CT("max_no_feed_time")
    public int maxNoFeedTime;

    @C09CT("max_wait_time")
    public int maxWaitTime;

    @C09CT("version")
    public int version;

    public TopLiveEnterRoomConfig() {
        this(0, 0, 0, false, false);
    }

    public TopLiveEnterRoomConfig(int i, int i2, int i3, boolean z, boolean z2) {
        this.version = i;
        this.maxWaitTime = i2;
        this.maxNoFeedTime = i3;
        this.cancelFeed = z;
        this.cancelTask = z2;
    }
}
