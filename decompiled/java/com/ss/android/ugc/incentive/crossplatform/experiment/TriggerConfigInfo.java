package com.ss.android.ugc.incentive.crossplatform.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class TriggerConfigInfo {

    @C09CT("pid_trigger_timing")
    public final List<String> pidTriggerTiming;

    @C09CT("trigger_timing")
    public final List<String> triggerTiming;

    public TriggerConfigInfo() {
        this(null, null, 3, null);
    }

    public TriggerConfigInfo(List<String> list, List<String> list2) {
        this.triggerTiming = list;
        this.pidTriggerTiming = list2;
    }

    public TriggerConfigInfo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
