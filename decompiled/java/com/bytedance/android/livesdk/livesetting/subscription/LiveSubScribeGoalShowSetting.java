package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_show_sub_goal")
public final class LiveSubScribeGoalShowSetting {
    public static final LiveSubScribeGoalShowSetting INSTANCE = new LiveSubScribeGoalShowSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_show_sub_goal", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
