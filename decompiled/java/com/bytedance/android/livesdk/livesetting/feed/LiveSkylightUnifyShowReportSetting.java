package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_skylight_unify_show_report")
public final class LiveSkylightUnifyShowReportSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSkylightUnifyShowReportSetting INSTANCE = new LiveSkylightUnifyShowReportSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_skylight_unify_show_report", DEFAULT);
    }
}
