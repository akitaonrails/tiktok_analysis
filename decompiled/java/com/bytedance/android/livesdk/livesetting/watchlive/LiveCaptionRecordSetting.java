package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_caption_record_setting")
public final class LiveCaptionRecordSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCaptionRecordSetting INSTANCE = new LiveCaptionRecordSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_caption_record_setting", DEFAULT);
    }
}
