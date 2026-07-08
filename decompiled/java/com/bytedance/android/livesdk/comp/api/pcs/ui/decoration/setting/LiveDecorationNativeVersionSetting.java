package com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_decoration_native_version_setting")
public final class LiveDecorationNativeVersionSetting {
    public static final int DEFAULT = 0;
    public static final LiveDecorationNativeVersionSetting INSTANCE = new LiveDecorationNativeVersionSetting();
    public static final int NON_SMB_ENABLE = 1;
    public static final int SMB_ENABLE = 2;
    public static final int ALL_ENABLE = 3;

    public final boolean enableAll() {
        return SettingsManager.INSTANCE.getIntValue("live_decoration_native_version_setting", DEFAULT) == ALL_ENABLE;
    }

    public final boolean enableNonSMB() {
        return SettingsManager.INSTANCE.getIntValue("live_decoration_native_version_setting", DEFAULT) == NON_SMB_ENABLE || enableAll();
    }

    public final boolean enableSMB() {
        return SettingsManager.INSTANCE.getIntValue("live_decoration_native_version_setting", DEFAULT) == SMB_ENABLE || enableAll();
    }
}
