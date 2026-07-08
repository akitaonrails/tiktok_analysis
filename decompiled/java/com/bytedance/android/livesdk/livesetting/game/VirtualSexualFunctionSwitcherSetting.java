package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "virtual_sexual_function_switcher")
public final class VirtualSexualFunctionSwitcherSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final VirtualSexualFunctionSwitcherSetting INSTANCE = new VirtualSexualFunctionSwitcherSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("virtual_sexual_function_switcher", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
