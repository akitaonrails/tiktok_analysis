package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBookingInfo implements Serializable {

    @C09CT("providers")
    public final List<PoiBookingProviderInfo> providers;

    public PoiBookingInfo(List<PoiBookingProviderInfo> list) {
        this.providers = list;
    }
}
