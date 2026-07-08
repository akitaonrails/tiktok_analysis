package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("livesdk_use_real_first_frame_render_callback")
public final class LivesdkUseRealFirstFrameRenderCallback {
    public static final boolean DEFAULT = false;
    public static final LivesdkUseRealFirstFrameRenderCallback INSTANCE = new LivesdkUseRealFirstFrameRenderCallback();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_use_real_first_frame_render_callback", DEFAULT);
    }
}
