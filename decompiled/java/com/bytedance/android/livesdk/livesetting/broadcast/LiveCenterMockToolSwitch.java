package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
@SettingsKey("live_center_mock_switch")
public final class LiveCenterMockToolSwitch {
    public static final String ANCHORCUE = "manager_cue";
    public static final String DEFAULT = "";
    public static final String FLARE = "flare";
    public static final String GROWTH = "growth";
    public static final LiveCenterMockToolSwitch INSTANCE = new LiveCenterMockToolSwitch();
    public static final String LIVEJOURNEY = "live_journey";
    public static final String LOP = "lop";
    public static final String PUNISH = "punish";
    public static final String WHITEBOX = "white_box";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_center_mock_switch", DEFAULT);
    }

    public final boolean isEnable() {
        return !a0.LJJJIL(getValue());
    }
}
