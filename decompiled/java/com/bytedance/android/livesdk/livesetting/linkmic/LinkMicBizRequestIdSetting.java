package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_biz_request_id_opt")
public final class LinkMicBizRequestIdSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicBizRequestIdSetting INSTANCE = new LinkMicBizRequestIdSetting();

    public static final boolean opt() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_biz_request_id_opt", DEFAULT);
    }
}
