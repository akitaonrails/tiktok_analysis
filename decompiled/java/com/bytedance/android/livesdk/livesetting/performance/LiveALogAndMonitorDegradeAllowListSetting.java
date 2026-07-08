package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_alog_and_monitor_allow_list")
public final class LiveALogAndMonitorDegradeAllowListSetting {
    public static final LiveALogAndMonitorDegradeAllowListSetting INSTANCE = new LiveALogAndMonitorDegradeAllowListSetting();
    public static final LiveALogAndMonitorDegradeModel DEFAULT = new LiveALogAndMonitorDegradeModel(new ArrayList(), new ArrayList());

    public final LiveALogAndMonitorDegradeModel getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveALogAndMonitorDegradeModel liveALogAndMonitorDegradeModel = DEFAULT;
        LiveALogAndMonitorDegradeModel liveALogAndMonitorDegradeModel2 = (LiveALogAndMonitorDegradeModel) settingsManager.getValueSafely("live_alog_and_monitor_allow_list", liveALogAndMonitorDegradeModel);
        return liveALogAndMonitorDegradeModel2 != null ? liveALogAndMonitorDegradeModel2 : liveALogAndMonitorDegradeModel;
    }

    public final LiveALogAndMonitorDegradeModel getDEFAULT() {
        return DEFAULT;
    }
}
