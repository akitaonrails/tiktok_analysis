package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AmberAlertDetail {

    @C09CT("amber_alert_id")
    public final String amberAlertId;

    @C09CT("last_update_time")
    public final Long lastUpdateTime;

    public AmberAlertDetail() {
        this("", 0L);
    }

    public AmberAlertDetail(String str, Long l) {
        this.amberAlertId = str;
        this.lastUpdateTime = l;
    }
}
