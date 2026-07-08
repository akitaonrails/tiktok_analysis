package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_multi_live_anchor_switch_frequency")
public final class MultiLiveAnchorSwitchFrequency {
    public static final MultiLiveAnchorSwitchFrequency INSTANCE = new MultiLiveAnchorSwitchFrequency();
    public static final int DEFAULT = 15;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_multi_live_anchor_switch_frequency", DEFAULT);
    }
}
