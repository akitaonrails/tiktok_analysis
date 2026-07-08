package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("bulletin_support_live_card")
public final class LiveBulletinSupportSetting {
    public static final LiveBulletinSupportSetting INSTANCE = new LiveBulletinSupportSetting();
    public static final int DEFAULT = 1;
    public static final int value = SettingsManager.INSTANCE.getIntValue("bulletin_support_live_card", DEFAULT);

    public final boolean enable() {
        return value == 1;
    }
}
