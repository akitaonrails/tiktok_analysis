package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_live_stream_entrance_type")
public final class MultiLiveStreamEntranceTypeSetting {
    public static final int DEFAULT = 0;
    public static final MultiLiveStreamEntranceTypeSetting INSTANCE = new MultiLiveStreamEntranceTypeSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_live_stream_entrance_type", DEFAULT);
    }

    public final boolean autoExitWhenUnlink() {
        return getValue() == 1;
    }

    public final boolean enable() {
        return getValue() > 0;
    }
}
