package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_sdk_permit_allow_source")
public final class LinkMicPermitAllowSourceSetting {
    public static final LinkMicPermitAllowSourceSetting INSTANCE = new LinkMicPermitAllowSourceSetting();
    public static final String[] DEFAULT = new String[0];

    public static final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("linkmic_sdk_permit_allow_source", DEFAULT);
    }
}
