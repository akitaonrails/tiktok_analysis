package com.ss.android.ugc.aweme.commercialize.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class CommerceALogConfig {

    @C09CT("ignore_params")
    public final List<String> ignoreParams;

    @C09CT("inject_type")
    public final int injectType;

    @C09CT("low_level_events")
    public final List<CommerceALogEvent> lowLevelEvents;

    public CommerceALogConfig() {
        this(0, null, null, 7, null);
    }

    public CommerceALogConfig(int i, List<CommerceALogEvent> list, List<String> list2) {
        this.injectType = i;
        this.lowLevelEvents = list;
        this.ignoreParams = list2;
    }

    public CommerceALogConfig(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
