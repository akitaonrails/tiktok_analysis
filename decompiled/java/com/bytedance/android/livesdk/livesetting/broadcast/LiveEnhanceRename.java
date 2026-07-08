package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enhance_rename_setting")
public final class LiveEnhanceRename {
    public static final int DEFAULT = 0;
    public static final LiveEnhanceRename INSTANCE = new LiveEnhanceRename();
    public static final int SETTING1 = 1;
    public static final int SETTING2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_enhance_rename_setting", DEFAULT);
    }

    public final boolean isV1() {
        return getValue() == 1;
    }

    public final boolean isV2() {
        return getValue() == 2;
    }
}
