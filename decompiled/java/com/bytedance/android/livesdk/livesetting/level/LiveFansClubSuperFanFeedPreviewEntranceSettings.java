package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_superfan_enable_native_opt")
public final class LiveFansClubSuperFanFeedPreviewEntranceSettings {
    public static final boolean DEFAULT = false;
    public static final LiveFansClubSuperFanFeedPreviewEntranceSettings INSTANCE = new LiveFansClubSuperFanFeedPreviewEntranceSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_superfan_enable_native_opt", DEFAULT);
    }
}
