package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes30.dex */
@SettingsKey(LiveCenterMockToolSwitch.WHITEBOX)
public final class LiveAnchorWhiteBox2Setting {
    public static final int DEFAULT = 0;
    public static final LiveAnchorWhiteBox2Setting INSTANCE = new LiveAnchorWhiteBox2Setting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue(LiveCenterMockToolSwitch.WHITEBOX, DEFAULT) > 0;
    }
}
