package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderStatusPollingConfigData {

    @C09CT("odp_polling_time")
    public final Long odpPollingTime;

    @C09CT("osp_polling_time")
    public final Long ospPollingTime;

    public PoiOrderStatusPollingConfigData() {
        this(2000L, 1000L);
    }

    public PoiOrderStatusPollingConfigData(Long l, Long l2) {
        this.ospPollingTime = l;
        this.odpPollingTime = l2;
    }
}
