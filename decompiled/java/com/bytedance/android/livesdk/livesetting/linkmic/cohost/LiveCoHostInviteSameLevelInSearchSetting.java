package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_invite_same_level_in_search")
public final class LiveCoHostInviteSameLevelInSearchSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostInviteSameLevelInSearchSetting INSTANCE = new LiveCoHostInviteSameLevelInSearchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_invite_same_level_in_search", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
