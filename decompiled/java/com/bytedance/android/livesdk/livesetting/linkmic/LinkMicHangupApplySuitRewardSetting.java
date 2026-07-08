package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_hangup_apply_suit_reward")
public final class LinkMicHangupApplySuitRewardSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicHangupApplySuitRewardSetting INSTANCE = new LinkMicHangupApplySuitRewardSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_hangup_apply_suit_reward", DEFAULT);
    }
}
