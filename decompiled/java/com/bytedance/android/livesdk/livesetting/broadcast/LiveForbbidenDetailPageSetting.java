package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_forbbiden_detail_page")
public final class LiveForbbidenDetailPageSetting {
    public static final String DEFAULT = "";
    public static final LiveForbbidenDetailPageSetting INSTANCE = new LiveForbbidenDetailPageSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_forbbiden_detail_page", DEFAULT);
    }
}
