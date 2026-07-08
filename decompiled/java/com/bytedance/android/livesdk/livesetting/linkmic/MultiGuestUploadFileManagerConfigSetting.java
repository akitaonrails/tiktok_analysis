package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_upload_file_manager_config_setting")
public final class MultiGuestUploadFileManagerConfigSetting {
    public static final MultiGuestUploadFileManagerConfigSetting INSTANCE = new MultiGuestUploadFileManagerConfigSetting();
    public static final MultiGuestUploadFileManagerConfig DEFAULT = new MultiGuestUploadFileManagerConfig(2, 2, 10, 5);

    public final MultiGuestUploadFileManagerConfig getValue() {
        MultiGuestUploadFileManagerConfig multiGuestUploadFileManagerConfig = (MultiGuestUploadFileManagerConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestUploadFileManagerConfigSetting.class);
        return multiGuestUploadFileManagerConfig == null ? DEFAULT : multiGuestUploadFileManagerConfig;
    }
}
