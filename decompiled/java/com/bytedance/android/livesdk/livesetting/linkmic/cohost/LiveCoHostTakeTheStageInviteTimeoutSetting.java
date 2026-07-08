package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_take_the_stage_invite_timeout")
public final class LiveCoHostTakeTheStageInviteTimeoutSetting {
    public static final LiveCoHostTakeTheStageInviteTimeoutSetting INSTANCE = new LiveCoHostTakeTheStageInviteTimeoutSetting();
    public static final long DEFAULT = 30;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_cohost_take_the_stage_invite_timeout", DEFAULT);
    }
}
