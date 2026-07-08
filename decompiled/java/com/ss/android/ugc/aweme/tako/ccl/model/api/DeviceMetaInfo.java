package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class DeviceMetaInfo {

    @C09CT("device_level")
    public final Integer deviceLevel;

    @C09CT("device_score")
    public final Double deviceScore;

    @C09CT("net_level")
    public final Integer netLevel;

    public DeviceMetaInfo() {
        this(null, null, null);
    }

    public DeviceMetaInfo(Integer num, Double d, Integer num2) {
        this.netLevel = num;
        this.deviceScore = d;
        this.deviceLevel = num2;
    }
}
