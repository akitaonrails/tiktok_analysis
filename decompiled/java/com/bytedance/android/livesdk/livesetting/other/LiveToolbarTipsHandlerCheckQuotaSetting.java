package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_toolbar_tips_check_quota")
public final class LiveToolbarTipsHandlerCheckQuotaSetting {
    public static final boolean DEFAULT = true;
    public static final LiveToolbarTipsHandlerCheckQuotaSetting INSTANCE = new LiveToolbarTipsHandlerCheckQuotaSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_toolbar_tips_check_quota", DEFAULT);
    }
}
