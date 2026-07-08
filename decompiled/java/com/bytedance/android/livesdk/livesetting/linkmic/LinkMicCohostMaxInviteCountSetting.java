package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cohost_max_invite_count")
public final class LinkMicCohostMaxInviteCountSetting {
    public static final int DEFAULT = 3;
    public static final LinkMicCohostMaxInviteCountSetting INSTANCE = new LinkMicCohostMaxInviteCountSetting();

    public final int getDefaultValue() {
        return 3;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_cohost_max_invite_count", DEFAULT);
    }
}
