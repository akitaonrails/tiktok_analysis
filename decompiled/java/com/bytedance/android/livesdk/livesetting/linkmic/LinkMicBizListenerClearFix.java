package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_biz_listener_clear_fix")
public final class LinkMicBizListenerClearFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicBizListenerClearFix INSTANCE = new LinkMicBizListenerClearFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_biz_listener_clear_fix", DEFAULT);
    }
}
