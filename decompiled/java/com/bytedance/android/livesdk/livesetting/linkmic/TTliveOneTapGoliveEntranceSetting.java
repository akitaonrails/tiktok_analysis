package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_one_tap_golive_entrance")
public final class TTliveOneTapGoliveEntranceSetting {
    public static final boolean DEFAULT = false;
    public static final TTliveOneTapGoliveEntranceSetting INSTANCE = new TTliveOneTapGoliveEntranceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_one_tap_golive_entrance", DEFAULT);
    }
}
