package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_top_one_fix")
public final class LiveTopOneFixSetting {
    public static final LiveTopOneFixSetting INSTANCE = new LiveTopOneFixSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_top_one_fix", true);

    public final boolean enable() {
        return value;
    }
}
