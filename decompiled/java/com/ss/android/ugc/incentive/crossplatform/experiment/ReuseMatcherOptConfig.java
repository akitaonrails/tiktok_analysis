package com.ss.android.ugc.incentive.crossplatform.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class ReuseMatcherOptConfig {

    @C09CT("enable_reuse_matcher_opt")
    public final boolean enableReuseMatcherOpt;

    @C09CT("reuse_matcher_must_check_params")
    public final List<String> reuseMatcherMustCheckParams;

    public ReuseMatcherOptConfig() {
        this(false, null, 3, null);
    }

    public ReuseMatcherOptConfig(boolean z, List<String> list) {
        this.enableReuseMatcherOpt = z;
        this.reuseMatcherMustCheckParams = list;
    }

    public ReuseMatcherOptConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
