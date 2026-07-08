package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_top_mask_default_show")
public final class LiveTopMaskDefaultShowSetting {
    public static final LiveTopMaskDefaultShowSetting INSTANCE = new LiveTopMaskDefaultShowSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_top_mask_default_show", true);

    public final boolean enable() {
        return value;
    }
}
