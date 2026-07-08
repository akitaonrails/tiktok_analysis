package com.bytedance.android.livesdk.live.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFollowFeedDrawLoop {
    public static final TypeAdapter ADAPTER = new LiveFollowFeedDrawLoop_OptTypeAdapter(NormalGson.singleton());

    @C09CT("loop_enable")
    public boolean enable;

    @C09CT("threshold")
    public int threshold;

    public static LiveFollowFeedDrawLoop getDefault() {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = new LiveFollowFeedDrawLoop();
        liveFollowFeedDrawLoop.enable = false;
        liveFollowFeedDrawLoop.threshold = 3;
        return liveFollowFeedDrawLoop;
    }

    public int getThreshold() {
        return this.threshold;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
