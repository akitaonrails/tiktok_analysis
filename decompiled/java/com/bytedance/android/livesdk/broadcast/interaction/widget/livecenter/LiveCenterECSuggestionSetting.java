package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_ec_suggestion")
public final class LiveCenterECSuggestionSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCenterECSuggestionSetting INSTANCE = new LiveCenterECSuggestionSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_center_ec_suggestion", DEFAULT);
    }
}
