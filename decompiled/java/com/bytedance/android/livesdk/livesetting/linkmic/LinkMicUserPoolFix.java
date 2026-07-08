package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_user_pool_fix")
public final class LinkMicUserPoolFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicUserPoolFix INSTANCE = new LinkMicUserPoolFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_user_pool_fix", DEFAULT);
    }
}
