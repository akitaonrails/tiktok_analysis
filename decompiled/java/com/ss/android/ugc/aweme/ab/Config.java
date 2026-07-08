package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class Config {

    @C09CT("enable_first_pull")
    public final boolean enableFirstPull;

    @C09CT("enable_re_prepull")
    public final boolean enableRePrePull;

    @C09CT("end_pull_segments")
    public final List<PullSegment> endPullSegments;

    @C09CT("first_pull_segments")
    public final List<PullSegment> firstPullSegments;

    public Config() {
        this(false, false, new ArrayList(), new ArrayList());
    }

    public Config(boolean z, boolean z2, List<PullSegment> list, List<PullSegment> list2) {
        this.enableFirstPull = z;
        this.enableRePrePull = z2;
        this.firstPullSegments = list;
        this.endPullSegments = list2;
    }
}
