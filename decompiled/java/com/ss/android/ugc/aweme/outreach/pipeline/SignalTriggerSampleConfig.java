package com.ss.android.ugc.aweme.outreach.pipeline;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SignalTriggerSampleConfig {

    @C09CT("events")
    public final List<String> events;

    @C09CT("sample_rate")
    public final double sampleRate;

    public SignalTriggerSampleConfig() {
        this(null, 0.0d, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalTriggerSampleConfig)) {
            return false;
        }
        SignalTriggerSampleConfig signalTriggerSampleConfig = (SignalTriggerSampleConfig) obj;
        return Intrinsics.LJFF(this.events, signalTriggerSampleConfig.events) && Double.compare(this.sampleRate, signalTriggerSampleConfig.sampleRate) == 0;
    }

    public final int hashCode() {
        return (this.events.hashCode() * 31) + C786410Ut5.X2(this.sampleRate);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalTriggerSampleConfig(events=");
        sbLIZ.append(this.events);
        sbLIZ.append(", sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SignalTriggerSampleConfig(List<String> list, double d) {
        this.events = list;
        this.sampleRate = d;
    }

    public SignalTriggerSampleConfig(List list, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0.0d : d);
    }
}
