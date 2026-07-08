package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SparkIsolationTrackModel {

    @C09CT("allIsolationEnable")
    public final Boolean allIsolationEnable;

    @C09CT("isolationStrategy")
    public final List<Integer> isolationStrategy;

    @C09CT("isolation_onpagestarted")
    public final Boolean isolation_onpagestarted;

    public SparkIsolationTrackModel() {
        this(Boolean.FALSE, Boolean.TRUE, C1697810uHb.LJIIJJI(0, 402685958));
    }

    public SparkIsolationTrackModel(Boolean bool, Boolean bool2, List<Integer> list) {
        this.isolation_onpagestarted = bool;
        this.allIsolationEnable = bool2;
        this.isolationStrategy = list;
    }
}
