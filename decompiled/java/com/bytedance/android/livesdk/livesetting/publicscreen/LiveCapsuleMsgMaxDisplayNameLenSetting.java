package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_capsule_msg_max_display_name_len_setting")
public final class LiveCapsuleMsgMaxDisplayNameLenSetting {
    public static final LiveCapsuleMsgMaxDisplayNameLenSetting INSTANCE = new LiveCapsuleMsgMaxDisplayNameLenSetting();
    public static final int DEFAULT = 0;
    public static final int maxDisplayNameLen = SettingsManager.INSTANCE.getIntValue("live_capsule_msg_max_display_name_len_setting", DEFAULT);

    public final int getMaxDisplayNameLen() {
        return maxDisplayNameLen;
    }
}
