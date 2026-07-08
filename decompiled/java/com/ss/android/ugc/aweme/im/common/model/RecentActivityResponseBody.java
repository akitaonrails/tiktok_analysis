package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecentActivityResponseBody implements Serializable {

    @C09CT("recent_activities")
    public final List<RecentActivityResponse> recentActivityMap;

    public RecentActivityResponseBody() {
        this(null);
    }

    public RecentActivityResponseBody(List<RecentActivityResponse> list) {
        this.recentActivityMap = list;
    }
}
