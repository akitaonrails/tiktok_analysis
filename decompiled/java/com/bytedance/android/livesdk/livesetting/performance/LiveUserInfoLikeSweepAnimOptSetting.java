package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_user_info_like_sweep_anim_opt")
public final class LiveUserInfoLikeSweepAnimOptSetting {
    public static final LiveUserInfoLikeSweepAnimOptSetting INSTANCE = new LiveUserInfoLikeSweepAnimOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_user_info_like_sweep_anim_opt", true);

    public static final boolean enable() {
        return value;
    }
}
