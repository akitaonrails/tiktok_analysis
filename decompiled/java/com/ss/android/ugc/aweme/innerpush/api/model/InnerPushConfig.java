package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class InnerPushConfig implements Serializable {

    @C09CT("avoid_scenes")
    public final List<Integer> avoidScenarios;

    @C09CT("freq_control_strategy")
    public final InnerPushFreqControlStrategy freqControlStrategy;

    @C09CT("popup_duration_seconds")
    public final int popupDurationSeconds;

    @C09CT("priority")
    public final int priority;

    @C09CT("ttl_seconds")
    public final long ttlSeconds;

    public InnerPushConfig() {
        this(0L, null, 0, null, 5);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerPushConfig(ttlSeconds=");
        sbLIZ.append(this.ttlSeconds);
        sbLIZ.append(", freqControlStrategy=");
        sbLIZ.append(this.freqControlStrategy);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", avoidScenarios=");
        sbLIZ.append(this.avoidScenarios);
        sbLIZ.append(", popupDurationSeconds=");
        sbLIZ.append(this.popupDurationSeconds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InnerPushConfig(long j, InnerPushFreqControlStrategy innerPushFreqControlStrategy, int i, List<Integer> list, int i2) {
        this.ttlSeconds = j;
        this.freqControlStrategy = innerPushFreqControlStrategy;
        this.priority = i;
        this.avoidScenarios = list;
        this.popupDurationSeconds = i2;
    }
}
