package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fans_club_not_report_event_button_type")
public final class LiveFansClubNotReportEventRanButtonListSetting {
    public static final LiveFansClubNotReportEventRanButtonListSetting INSTANCE = new LiveFansClubNotReportEventRanButtonListSetting();
    public static final List<String> DEFAULT = Collections.singletonList("support");

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("live_fans_club_not_report_event_button_type", list);
        return list2 != null ? list2 : list;
    }
}
