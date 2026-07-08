package com.ss.android.ugc.aweme.ecommerce.network;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ECNetworkQualityReportConfigModel {

    @C09CT("ecom_network_quality_events")
    public final List<String> networkQualityEvents;

    public ECNetworkQualityReportConfigModel() {
        this(null, 1, null);
    }

    public ECNetworkQualityReportConfigModel(List<String> list) {
        this.networkQualityEvents = list;
    }

    public ECNetworkQualityReportConfigModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
