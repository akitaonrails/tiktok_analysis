package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_middle_touch_anchor_enable")
public final class LiveMiddleTouchAnchorEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMiddleTouchAnchorEnableSetting INSTANCE = new LiveMiddleTouchAnchorEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_middle_touch_anchor_enable", DEFAULT);
    }
}
