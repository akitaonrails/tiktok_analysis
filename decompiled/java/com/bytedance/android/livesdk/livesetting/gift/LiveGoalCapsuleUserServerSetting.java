package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_goal_finish_capsule_disable")
public final class LiveGoalCapsuleUserServerSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGoalCapsuleUserServerSetting INSTANCE = new LiveGoalCapsuleUserServerSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_goal_finish_capsule_disable", DEFAULT);
    }
}
