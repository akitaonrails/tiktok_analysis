package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_cohost_audience_enter_room_layout_sei_optz")
public final class MultiCohostRoomLoadingOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiCohostRoomLoadingOptSetting INSTANCE = new MultiCohostRoomLoadingOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_audience_enter_room_layout_sei_optz", DEFAULT);
    }
}
