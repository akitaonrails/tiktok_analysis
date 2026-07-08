package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_outside_biz_register_priority")
public final class LiveOutsideBizRegisterPrioritySetting {
    public static final int DEFAULT = 1;
    public static final LiveOutsideBizRegisterPrioritySetting INSTANCE = new LiveOutsideBizRegisterPrioritySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_outside_biz_register_priority", DEFAULT);
    }
}
