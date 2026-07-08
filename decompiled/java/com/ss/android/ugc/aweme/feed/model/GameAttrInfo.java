package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class GameAttrInfo implements Serializable {

    @C09CT("common_params")
    public String commonParams;

    @C09CT("domain")
    public String domain;

    @C09CT("report_threshold")
    public List<GameAttrReportThreshold> reportThreshold;

    @C09CT("view_through_url")
    public String viewThroughUrl;

    public GameAttrInfo() {
        this(null, null, null, null, 15, null);
    }

    public GameAttrInfo(String str, String str2, List<GameAttrReportThreshold> list, String str3) {
        this.commonParams = str;
        this.domain = str2;
        this.reportThreshold = list;
        this.viewThroughUrl = str3;
    }

    public GameAttrInfo(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : str3);
    }
}
