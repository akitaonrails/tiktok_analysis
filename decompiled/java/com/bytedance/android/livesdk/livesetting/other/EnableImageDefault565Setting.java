package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("enable_image_default_565")
public final class EnableImageDefault565Setting {
    public static final boolean DEFAULT = true;
    public static final EnableImageDefault565Setting INSTANCE = new EnableImageDefault565Setting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_image_default_565", DEFAULT);
    }
}
