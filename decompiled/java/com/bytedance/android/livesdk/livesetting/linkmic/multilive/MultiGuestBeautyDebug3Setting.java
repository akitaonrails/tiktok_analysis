package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multiguest_out_cap_fps_setting")
public final class MultiGuestBeautyDebug3Setting {
    public static final int DEFAULT = 15;
    public static final MultiGuestBeautyDebug3Setting INSTANCE = new MultiGuestBeautyDebug3Setting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multiguest_out_cap_fps_setting", DEFAULT);
    }
}
