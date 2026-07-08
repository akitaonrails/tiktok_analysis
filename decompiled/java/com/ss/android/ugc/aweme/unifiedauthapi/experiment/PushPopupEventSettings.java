package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PushPopupEventSettings {

    @C09CT("async_tracking_enabled")
    public final boolean asyncTrackingEnabled;

    @C09CT("data_expire_days")
    public final int dataExpireDays;

    @C09CT("store_enable")
    public final boolean enablePopupEventTracking;

    @C09CT("report_interval_in_mins")
    public final int reportIntervalInMinutes;

    @C09CT("report_items_per_request")
    public final int uploadItemsLimitPerRequest;

    public PushPopupEventSettings() {
        this(true, 30, 1440, 50, false);
    }

    public PushPopupEventSettings(boolean z, int i, int i2, int i3, boolean z2) {
        this.enablePopupEventTracking = z;
        this.dataExpireDays = i;
        this.reportIntervalInMinutes = i2;
        this.uploadItemsLimitPerRequest = i3;
        this.asyncTrackingEnabled = z2;
    }
}
