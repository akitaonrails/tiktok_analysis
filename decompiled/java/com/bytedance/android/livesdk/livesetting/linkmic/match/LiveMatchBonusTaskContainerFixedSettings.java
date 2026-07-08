package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_fix_bonus_task_update_height_settings")
public final class LiveMatchBonusTaskContainerFixedSettings {
    public static final boolean DEFAULT = true;
    public static final LiveMatchBonusTaskContainerFixedSettings INSTANCE = new LiveMatchBonusTaskContainerFixedSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_fix_bonus_task_update_height_settings", DEFAULT);
    }
}
