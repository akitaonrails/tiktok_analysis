package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_inner_media_list_transmission")
public final class LiveInnerMediaListSetting {
    public static final int DEFAULT = 0;
    public static final LiveInnerMediaListSetting INSTANCE = new LiveInnerMediaListSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_inner_media_list_transmission", DEFAULT);
    }

    public final boolean enableTransmitMediaList() {
        return getValue() != DEFAULT;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
