package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_unlock_privilege_bubble_cache_length")
public final class LevelPrivilegeUnlockBubbleCacheLengthSetting {
    public static final int DEFAULT = 162;
    public static final LevelPrivilegeUnlockBubbleCacheLengthSetting INSTANCE = new LevelPrivilegeUnlockBubbleCacheLengthSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_unlock_privilege_bubble_cache_length", DEFAULT);
    }
}
