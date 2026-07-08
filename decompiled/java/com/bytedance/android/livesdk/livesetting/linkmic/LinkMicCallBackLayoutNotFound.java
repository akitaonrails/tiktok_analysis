package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_call_back_layout_not_found")
public final class LinkMicCallBackLayoutNotFound {
    public static final boolean DEFAULT = true;
    public static final LinkMicCallBackLayoutNotFound INSTANCE = new LinkMicCallBackLayoutNotFound();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_call_back_layout_not_found", DEFAULT);
    }
}
