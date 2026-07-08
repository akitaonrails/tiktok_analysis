package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_live_play_log_migrate")
public final class LinkMicLivePlayLogMigrate {
    public static final boolean DEFAULT = false;
    public static final LinkMicLivePlayLogMigrate INSTANCE = new LinkMicLivePlayLogMigrate();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_live_play_log_migrate", DEFAULT);
    }
}
