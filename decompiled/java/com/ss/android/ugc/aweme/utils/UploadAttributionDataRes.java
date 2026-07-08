package com.ss.android.ugc.aweme.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class UploadAttributionDataRes {

    @C09CT("data")
    public final AttributionLandingData data;

    @C09CT("err_no")
    public final int errCode;

    public UploadAttributionDataRes() {
        this(-1, null);
    }

    public UploadAttributionDataRes(int i, AttributionLandingData attributionLandingData) {
        this.errCode = i;
        this.data = attributionLandingData;
    }
}
