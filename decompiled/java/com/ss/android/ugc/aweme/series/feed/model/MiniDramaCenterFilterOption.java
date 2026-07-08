package com.ss.android.ugc.aweme.series.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaCenterFilterOption {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("metric_name")
    public final String metricName;

    @C09CT("name")
    public final String name;

    @C09CT("should_hide_when_collapsed")
    public final Boolean shouldHideWhenCollapsed;

    public MiniDramaCenterFilterOption() {
        this(null, null, null, null);
    }

    public MiniDramaCenterFilterOption(String str, String str2, Boolean bool, String str3) {
        this.name = str;
        this.id = str2;
        this.shouldHideWhenCollapsed = bool;
        this.metricName = str3;
    }
}
