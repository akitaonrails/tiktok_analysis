package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("add_live_slardar_tag")
public final class LiveSlardarTagSetting {
    public static final LiveSlardarTagSetting INSTANCE = new LiveSlardarTagSetting();
    public static final SlardarTagData DEFAULT = new SlardarTagData(true, 5, 5);

    public final SlardarTagData getCurrentValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SlardarTagData slardarTagData = DEFAULT;
        SlardarTagData slardarTagData2 = (SlardarTagData) settingsManager.getValueSafely("add_live_slardar_tag", slardarTagData);
        return slardarTagData2 != null ? slardarTagData2 : slardarTagData;
    }

    public final SlardarTagData getDEFAULT() {
        return DEFAULT;
    }
}
