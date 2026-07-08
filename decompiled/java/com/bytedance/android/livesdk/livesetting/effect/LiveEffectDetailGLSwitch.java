package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_detail_gl_switch")
public final class LiveEffectDetailGLSwitch {
    public static final LiveEffectDetailGLSwitch INSTANCE = new LiveEffectDetailGLSwitch();
    public static final int DEFAULT = 1;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("live_effect_detail_gl_switch", 1);

    public final boolean enable() {
        return setting > 0;
    }
}
