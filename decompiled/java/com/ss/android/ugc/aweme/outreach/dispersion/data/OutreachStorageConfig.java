package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachStorageConfig {

    @C09CT("dispersion_quota_delay_time_android")
    public int dispersionQuotaDelayTimeAndroid;

    @C09CT("max_active_day_count")
    public int maxActiveDayCount;

    @C09CT("max_cached_log_count")
    public int maxCachedLogCount;

    @C09CT("max_session_count")
    public int maxSessionCount;

    @C09CT("max_shown_model_count")
    public int maxShownModelCount;

    @C09CT("outreach_init_delay")
    public boolean outreachInitDelay;

    public OutreachStorageConfig() {
        this(false, LSPassThroughRecordSizeConfig.DEFAULT, 200, 500, 200, 500);
    }

    public OutreachStorageConfig(boolean z, int i, int i2, int i3, int i4, int i5) {
        this.outreachInitDelay = z;
        this.dispersionQuotaDelayTimeAndroid = i;
        this.maxSessionCount = i2;
        this.maxShownModelCount = i3;
        this.maxActiveDayCount = i4;
        this.maxCachedLogCount = i5;
    }
}
