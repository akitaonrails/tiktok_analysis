package com.bytedance.android.livesdk.livefinishcard;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "push_live_end_use_simple_feed")
public final class LivePushLiveEndUseSimpleFeed {
    public static final boolean DEFAULT = false;
    public static final LivePushLiveEndUseSimpleFeed INSTANCE = new LivePushLiveEndUseSimpleFeed();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("push_live_end_use_simple_feed", DEFAULT);
    }
}
