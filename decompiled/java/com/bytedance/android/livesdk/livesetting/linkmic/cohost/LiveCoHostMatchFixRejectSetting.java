package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_match_fix_reject")
public final class LiveCoHostMatchFixRejectSetting {
    public static final LiveCoHostMatchFixRejectSetting INSTANCE = new LiveCoHostMatchFixRejectSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_match_fix_reject", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
