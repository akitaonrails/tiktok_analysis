package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicSyncResult {

    @C09CT("duration_sec")
    public final double durationSec;

    @C09CT("pred")
    public final List<Double> predSec;

    @C09CT("task_flow")
    public final TaskFlow taskFlow;

    public MusicSyncResult() {
        this(0.0d, null, null, 7, null);
    }

    public MusicSyncResult(double d, List<Double> list, TaskFlow taskFlow) {
        this.durationSec = d;
        this.predSec = list;
        this.taskFlow = taskFlow;
    }

    public MusicSyncResult(double d, List list, TaskFlow taskFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? new TaskFlow(null, 1, null) : taskFlow);
    }
}
