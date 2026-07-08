package com.ss.android.ugc.aweme.kids.common.response;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class KMReportReason {

    @C09CT("video")
    public final List<KMVideoReportReason> video;

    public KMReportReason() {
        this(null, 1, null);
    }

    public KMReportReason(List<KMVideoReportReason> list) {
        this.video = list;
    }

    public KMReportReason(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
