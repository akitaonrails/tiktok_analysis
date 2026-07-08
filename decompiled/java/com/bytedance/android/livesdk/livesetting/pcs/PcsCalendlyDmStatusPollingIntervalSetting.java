package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("pcs_calendly_meeting_dm_status_polling_interval")
public final class PcsCalendlyDmStatusPollingIntervalSetting {
    public static final PcsCalendlyDmStatusPollingIntervalSetting INSTANCE = new PcsCalendlyDmStatusPollingIntervalSetting();
    public static final String[] DEFAULT = {CardStruct.IStatusCode.DEFAULT, "1000", "2000", "3000"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("pcs_calendly_meeting_dm_status_polling_interval", DEFAULT);
    }
}
