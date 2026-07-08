package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_gl_thread_create_failed_optimize")
public final class LinkMicGLThreadCreateFailedOptimize {
    public static final boolean DEFAULT = true;
    public static final LinkMicGLThreadCreateFailedOptimize INSTANCE = new LinkMicGLThreadCreateFailedOptimize();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_gl_thread_create_failed_optimize", DEFAULT);
    }
}
