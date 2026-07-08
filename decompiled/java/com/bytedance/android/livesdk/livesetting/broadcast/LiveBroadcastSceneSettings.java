package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_broadcast_scene_settings")
public final class LiveBroadcastSceneSettings {
    public static final LiveBroadcastSceneSettings INSTANCE = new LiveBroadcastSceneSettings();
    public static final boolean DEFAULT = true;

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastSceneSettings.class);
    }
}
