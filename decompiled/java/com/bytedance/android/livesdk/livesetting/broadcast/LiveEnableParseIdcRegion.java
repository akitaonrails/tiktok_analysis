package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enable_parse_idc_region")
public final class LiveEnableParseIdcRegion {
    public static final boolean DEFAULT = true;
    public static final LiveEnableParseIdcRegion INSTANCE = new LiveEnableParseIdcRegion();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_parse_idc_region", DEFAULT);
    }
}
