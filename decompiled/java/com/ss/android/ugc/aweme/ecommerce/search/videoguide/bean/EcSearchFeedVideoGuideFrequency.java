package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchFeedVideoGuideFrequency implements Serializable {
    public static final int $stable = 8;

    @C09CT("last_non_click_timestamp")
    public final long lastNonClickTimeStamp;

    @C09CT("non_click_count")
    public final int nonClickCount;

    @C09CT("show_records")
    public final List<Long> showRecords;

    @C09CT("times")
    public final int times;

    @C09CT("timestamp")
    public final String timestamp;

    public EcSearchFeedVideoGuideFrequency() {
        this(null, 0, null, 0, 0L, 31, null);
    }

    public final EcSearchFeedVideoGuideFrequency copy(String str, int i, List<Long> list, int i2, long j) {
        return new EcSearchFeedVideoGuideFrequency(str, i, list, i2, j);
    }

    public EcSearchFeedVideoGuideFrequency(String str, int i, List<Long> list, int i2, long j) {
        this.timestamp = str;
        this.times = i;
        this.showRecords = list;
        this.nonClickCount = i2;
        this.lastNonClickTimeStamp = j;
    }

    public EcSearchFeedVideoGuideFrequency(String str, int i, List list, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? 0L : j);
    }
}
