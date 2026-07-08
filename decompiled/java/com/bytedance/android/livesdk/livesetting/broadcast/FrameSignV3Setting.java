package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_frame_sign_setting_v3")
public final class FrameSignV3Setting {
    public static final boolean DEFAULT = true;
    public static final FrameSignV3Setting INSTANCE = new FrameSignV3Setting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_frame_sign_setting_v3", DEFAULT);
    }
}
