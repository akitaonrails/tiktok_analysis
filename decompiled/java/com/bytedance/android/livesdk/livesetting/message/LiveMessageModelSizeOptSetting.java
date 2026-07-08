package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_opt_model_size")
public final class LiveMessageModelSizeOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMessageModelSizeOptSetting INSTANCE = new LiveMessageModelSizeOptSetting();

    public final boolean notAppendRawProtoOnNoLinkMessage() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_opt_model_size", DEFAULT);
    }

    public final boolean notKeepRawProtoMessageOnApiResult() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_opt_model_size", DEFAULT);
    }
}
