package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_record_match")
public final class LiveMatchRecordSwitch {
    public static final LiveMatchRecordSwitch INSTANCE = new LiveMatchRecordSwitch();
    public static final int DEFAULT = 0;
    public static final int liveRecordMatchEnable = SettingsManager.INSTANCE.getIntValue("live_record_match", DEFAULT);

    public final boolean enable() {
        return liveRecordMatchEnable != 0;
    }

    public final boolean enableToast() {
        return liveRecordMatchEnable == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
