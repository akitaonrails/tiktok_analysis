package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_top_tab_switch")
public final class LiveTopTabSwitch {
    public static final LiveTopTabSwitch INSTANCE = new LiveTopTabSwitch();
    public static final LiveTopTabData DEFAULT = new LiveTopTabData(true, true, true, true, true, false, 300);

    public static final boolean clearScreen() {
        return INSTANCE.getSettingValue().clearScreen;
    }

    private final LiveTopTabData getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveTopTabData liveTopTabData = DEFAULT;
        LiveTopTabData liveTopTabData2 = (LiveTopTabData) settingsManager.getValueSafely("live_top_tab_switch", liveTopTabData);
        return liveTopTabData2 != null ? liveTopTabData2 : liveTopTabData;
    }

    public static final long getTabStayTimeSecondsThreshold() {
        return INSTANCE.getSettingValue().landingTabTimeSecondsThreshold;
    }

    public static final boolean hideLiveEndPageCloseBtn() {
        return INSTANCE.getSettingValue().hideLiveEndPageCloseBtn;
    }

    public static final boolean isEnable() {
        return INSTANCE.getSettingValue().f37switch;
    }

    public static final boolean landscapeOptRevertSwitch() {
        return INSTANCE.getSettingValue().landscapeOptRevertSwitch;
    }

    public static final boolean lynxPrefetchEnable() {
        return INSTANCE.getSettingValue().lynxPrefetchEnable;
    }

    public static final boolean slideOpt() {
        return INSTANCE.getSettingValue().slideOpt;
    }
}
