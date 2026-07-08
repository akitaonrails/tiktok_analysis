package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_jsb_allowed_list")
public final class LiveJsbAllowedListSetting {
    public static final LiveJsbAllowedListSetting INSTANCE = new LiveJsbAllowedListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_jsb_allowed_list", DEFAULT);
    }
}
