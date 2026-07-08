package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_sdk_set_live_sei")
public final class LinkMicSetLiveSeiSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicSetLiveSeiSetting INSTANCE = new LinkMicSetLiveSeiSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_set_live_sei", DEFAULT);
    }
}
