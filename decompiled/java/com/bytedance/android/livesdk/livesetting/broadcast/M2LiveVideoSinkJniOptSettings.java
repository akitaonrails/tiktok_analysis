package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey("m2live_video_jni_opt_settings")
public final class M2LiveVideoSinkJniOptSettings {
    public static final int DEFAULT = 0;
    public static final M2LiveVideoSinkJniOptSettings INSTANCE = new M2LiveVideoSinkJniOptSettings();

    public final boolean isLiveCoreOnJavaEnabled() {
        return isEnabled(2);
    }

    public final boolean isRenderSinkOnJavaEnabled() {
        return isEnabled(1);
    }

    public final boolean isRenderSinkSkipMixEnabled() {
        return isEnabled(4);
    }

    public final boolean isRenderSinkDisableThreadEnabled() {
        return isEnabled(8);
    }

    private final boolean isEnabled(int i) {
        if ((SettingsManager.INSTANCE.getIntValue("m2live_video_jni_opt_settings", DEFAULT) & i) == i) {
            return true;
        }
        return false;
    }
}
