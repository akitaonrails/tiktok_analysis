package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_multiguest_debug2_beauty_setting")
public final class MultiGuestBeautyDebug2Setting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestBeautyDebug2Setting INSTANCE = new MultiGuestBeautyDebug2Setting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_multiguest_debug2_beauty_setting", DEFAULT);
    }
}
