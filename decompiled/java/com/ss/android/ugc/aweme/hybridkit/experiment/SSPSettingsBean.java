package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class SSPSettingsBean {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("ssp_fetcher_bids")
    public final List<String> sspFetcherBidList;

    public SSPSettingsBean() {
        this(false, null, 3, null);
    }

    public SSPSettingsBean(boolean z, List<String> list) {
        this.enable = z;
        this.sspFetcherBidList = list;
    }

    public SSPSettingsBean(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
