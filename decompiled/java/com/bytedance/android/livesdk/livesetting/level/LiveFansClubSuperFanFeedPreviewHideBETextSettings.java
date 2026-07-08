package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_superfan_feed_preview_card_hide_be_text")
public final class LiveFansClubSuperFanFeedPreviewHideBETextSettings {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubSuperFanFeedPreviewHideBETextSettings INSTANCE = new LiveFansClubSuperFanFeedPreviewHideBETextSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_superfan_feed_preview_card_hide_be_text", DEFAULT);
    }
}
