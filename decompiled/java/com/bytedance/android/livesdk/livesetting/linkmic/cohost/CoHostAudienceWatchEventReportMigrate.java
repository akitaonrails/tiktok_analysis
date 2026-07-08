package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_cohost_audience_watch_event_migrate")
public final class CoHostAudienceWatchEventReportMigrate {
    public static final CoHostAudienceWatchEventReportMigrate INSTANCE = new CoHostAudienceWatchEventReportMigrate();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_cohost_audience_watch_event_migrate", DEFAULT);

    public final boolean isEnable() {
        return value > 0;
    }
}
