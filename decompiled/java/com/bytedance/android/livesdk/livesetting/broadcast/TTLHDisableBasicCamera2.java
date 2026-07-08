package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_disable_basic_camera2")
public final class TTLHDisableBasicCamera2 {
    public static final TTLHDisableBasicCamera2 INSTANCE = new TTLHDisableBasicCamera2();
    public static final int DEFAULT = 1;

    public final boolean value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_disable_basic_camera2", DEFAULT) == 1;
    }
}
