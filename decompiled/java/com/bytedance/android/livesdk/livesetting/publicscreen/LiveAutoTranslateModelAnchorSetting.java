package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_auto_translate_model_anchor")
public final class LiveAutoTranslateModelAnchorSetting {
    public static final int DEFAULT = 0;
    public static final LiveAutoTranslateModelAnchorSetting INSTANCE = new LiveAutoTranslateModelAnchorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_auto_translate_model_anchor", DEFAULT);
    }
}
