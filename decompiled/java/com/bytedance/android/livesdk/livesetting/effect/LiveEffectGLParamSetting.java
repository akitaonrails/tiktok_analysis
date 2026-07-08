package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_gl_param_enable")
public final class LiveEffectGLParamSetting {
    public static final LiveEffectGLParamSetting INSTANCE = new LiveEffectGLParamSetting();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("live_effect_gl_param_enable", DEFAULT);

    public final boolean enable() {
        return setting > 0;
    }
}
