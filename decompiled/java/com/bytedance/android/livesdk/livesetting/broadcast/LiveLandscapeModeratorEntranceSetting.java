package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("block_landscape_moderator_entrance_setting")
public final class LiveLandscapeModeratorEntranceSetting {
    public static final boolean DEFAULT = true;
    public static final LiveLandscapeModeratorEntranceSetting INSTANCE = new LiveLandscapeModeratorEntranceSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("block_landscape_moderator_entrance_setting", DEFAULT);
    }
}
