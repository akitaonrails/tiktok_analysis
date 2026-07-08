package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes7.dex */
@SettingsKey("live_advanced_message_continues_animation")
public final class LiveAdvanceMessageContinuesAnimSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAdvanceMessageContinuesAnimSetting INSTANCE = new LiveAdvanceMessageContinuesAnimSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_advanced_message_continues_animation", DEFAULT);
    }
}
