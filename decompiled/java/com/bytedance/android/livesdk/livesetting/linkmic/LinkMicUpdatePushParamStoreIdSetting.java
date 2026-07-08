package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "update_push_param_store_id")
public final class LinkMicUpdatePushParamStoreIdSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicUpdatePushParamStoreIdSetting INSTANCE = new LinkMicUpdatePushParamStoreIdSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("update_push_param_store_id", DEFAULT);
    }
}
