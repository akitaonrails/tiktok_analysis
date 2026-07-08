package com.ss.android.ugc.aweme.compliance.protection.amberalert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class AmberAlertStorage implements Serializable {
    public static final int $stable = 0;

    @C09CT("amber_alert_id")
    public final String alertId;

    @C09CT("last_shown_timestamp")
    public final long lastShownTimeStamp;

    @C09CT("last_update_timestamp")
    public final long lastUpdateTime;

    @C09CT("total_shown_times")
    public final int totalShownTimes;

    public final AmberAlertStorage copy(String str, long j, long j2, int i) {
        return new AmberAlertStorage(str, j, j2, i);
    }

    public AmberAlertStorage() {
        this("", 0L, 0L, 0);
    }

    public AmberAlertStorage(String str, long j, long j2, int i) {
        this.alertId = str;
        this.lastUpdateTime = j;
        this.lastShownTimeStamp = j2;
        this.totalShownTimes = i;
    }
}
