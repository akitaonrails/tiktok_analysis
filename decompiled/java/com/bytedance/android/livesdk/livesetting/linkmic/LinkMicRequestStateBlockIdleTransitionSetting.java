package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_request_state_block_idle_transition")
public final class LinkMicRequestStateBlockIdleTransitionSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicRequestStateBlockIdleTransitionSetting INSTANCE = new LinkMicRequestStateBlockIdleTransitionSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_request_state_block_idle_transition", DEFAULT);
    }
}
