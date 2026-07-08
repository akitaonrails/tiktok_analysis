package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_cohost_link_state_skip_enable")
public final class MultiHostPauseLiveAnchorSkipEnableSetting {
    public static final int DEFAULT = 0;
    public static final MultiHostPauseLiveAnchorSkipEnableSetting INSTANCE = new MultiHostPauseLiveAnchorSkipEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_link_state_skip_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
