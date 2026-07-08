package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_trigger_scale_production_setting")
public final class LiveTriggerScaleProduceSettings {
    public static final LiveTriggerScaleProduceSettings INSTANCE = new LiveTriggerScaleProduceSettings();
    public static final TriggerScaleProduceParams DEFAULT = new TriggerScaleProduceParams(0, 30, "");

    private final TriggerScaleProduceParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TriggerScaleProduceParams triggerScaleProduceParams = DEFAULT;
        TriggerScaleProduceParams triggerScaleProduceParams2 = (TriggerScaleProduceParams) settingsManager.getValueSafely("live_trigger_scale_production_setting", triggerScaleProduceParams);
        return triggerScaleProduceParams2 != null ? triggerScaleProduceParams2 : triggerScaleProduceParams;
    }

    public final String algoPkgName() {
        return getValue().algoPackageName;
    }

    public final int delayTime() {
        return getValue().delayExecuteTime;
    }

    public final boolean enable() {
        return getValue().enable > 0;
    }
}
