package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_app_sei_mode")
public final class LinkMicAppSeiMode {
    public static final LinkMicAppSeiMode INSTANCE = new LinkMicAppSeiMode();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_app_sei_mode", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() != DEFAULT;
    }
}
