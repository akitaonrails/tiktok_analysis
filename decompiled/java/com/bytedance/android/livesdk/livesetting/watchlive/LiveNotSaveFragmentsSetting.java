package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_not_save_fragments")
public final class LiveNotSaveFragmentsSetting {
    public static final boolean DEFAULT = false;
    public static final LiveNotSaveFragmentsSetting INSTANCE = new LiveNotSaveFragmentsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_not_save_fragments", DEFAULT);
    }
}
