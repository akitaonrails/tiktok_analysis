package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_upload_image_jsb_disable_uri")
public final class LiveHybridUploadImageJsbDisableUriSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridUploadImageJsbDisableUriSetting INSTANCE = new LiveHybridUploadImageJsbDisableUriSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_upload_image_jsb_disable_uri", DEFAULT);
    }
}
