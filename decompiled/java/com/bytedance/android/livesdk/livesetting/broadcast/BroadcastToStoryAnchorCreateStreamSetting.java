package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_live_to_story_anchor_create_stream")
public final class BroadcastToStoryAnchorCreateStreamSetting {
    public static final boolean DEFAULT = true;
    public static final BroadcastToStoryAnchorCreateStreamSetting INSTANCE = new BroadcastToStoryAnchorCreateStreamSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_live_to_story_anchor_create_stream", DEFAULT);
    }
}
