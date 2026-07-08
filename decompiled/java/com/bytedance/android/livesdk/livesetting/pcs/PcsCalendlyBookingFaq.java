package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("pcs_calendly_meeting_faq")
public final class PcsCalendlyBookingFaq {
    public static final PcsCalendlyBookingFaq INSTANCE = new PcsCalendlyBookingFaq();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("pcs_calendly_meeting_faq", DEFAULT);
    }
}
