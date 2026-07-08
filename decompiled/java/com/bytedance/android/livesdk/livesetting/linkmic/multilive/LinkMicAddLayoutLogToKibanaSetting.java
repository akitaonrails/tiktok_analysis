package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_add_layout_log_to_kibana")
public final class LinkMicAddLayoutLogToKibanaSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicAddLayoutLogToKibanaSetting INSTANCE = new LinkMicAddLayoutLogToKibanaSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_add_layout_log_to_kibana", DEFAULT);
    }
}
