package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("barrage_content_adjust_rtl")
public final class BarrageContentAdjustRTL {
    public static final boolean DEFAULT = true;
    public static final BarrageContentAdjustRTL INSTANCE = new BarrageContentAdjustRTL();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("barrage_content_adjust_rtl", DEFAULT);
    }
}
