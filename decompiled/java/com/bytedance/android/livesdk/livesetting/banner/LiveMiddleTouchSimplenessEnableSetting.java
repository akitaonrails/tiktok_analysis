package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_main_framework_middle_touch_simpleness")
public final class LiveMiddleTouchSimplenessEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMiddleTouchSimplenessEnableSetting INSTANCE = new LiveMiddleTouchSimplenessEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_main_framework_middle_touch_simpleness", DEFAULT);
    }
}
