package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_enter_foreground_black_screen_opt")
public final class AnchorEnterForegroundBlackScreenOptABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorEnterForegroundBlackScreenOptABSetting INSTANCE = new AnchorEnterForegroundBlackScreenOptABSetting();

    public final boolean isV1() {
        return SettingsManager.INSTANCE.getIntValue("anchor_enter_foreground_black_screen_opt", DEFAULT) == 1;
    }

    public final boolean isV2() {
        return SettingsManager.INSTANCE.getIntValue("anchor_enter_foreground_black_screen_opt", DEFAULT) == 2;
    }

    public final boolean enable() {
        return isV1() || isV2();
    }
}
