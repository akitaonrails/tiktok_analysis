package com.ss.android.ugc.aweme.ad.feed.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes34.dex */
public final class ImaAdsDetectAppConfigModel {

    @C09CT("app_list")
    public final List<AppInfo> appList;

    @C09CT("detect_intervals_ms")
    public final long detectIntervalsMs;

    public ImaAdsDetectAppConfigModel() {
        this(0L, null, 3, null);
    }

    public ImaAdsDetectAppConfigModel(long j, List<AppInfo> list) {
        this.detectIntervalsMs = j;
        this.appList = list;
    }

    public ImaAdsDetectAppConfigModel(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Long.MAX_VALUE : j, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
