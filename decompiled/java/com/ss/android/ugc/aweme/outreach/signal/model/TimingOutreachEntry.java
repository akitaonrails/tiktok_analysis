package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class TimingOutreachEntry {

    @C09CT("abilities")
    public final List<String> abilities;

    @C09CT("ext_config")
    public final n extConfig;

    @C09CT("frequency")
    public final Long frequency;

    @C09CT("outreach_type")
    public final List<String> outreachType;

    @C09CT("timing_key")
    public final String timingKey;

    @C09CT("timing_processor_config")
    public final List<Object> timingProcessorConfig;

    public TimingOutreachEntry() {
        this(null, null, 0L, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimingOutreachEntry(timingKey=");
        sbLIZ.append(this.timingKey);
        sbLIZ.append(", outreachType=");
        sbLIZ.append(this.outreachType);
        sbLIZ.append(", frequency=");
        sbLIZ.append(this.frequency);
        sbLIZ.append(", extConfig=");
        sbLIZ.append(this.extConfig);
        sbLIZ.append(", timingProcessorConfig=");
        sbLIZ.append(this.timingProcessorConfig);
        sbLIZ.append(", abilities=");
        sbLIZ.append(this.abilities);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TimingOutreachEntry(String str, List<String> list, Long l, n nVar, List<Object> list2, List<String> list3) {
        this.timingKey = str;
        this.outreachType = list;
        this.frequency = l;
        this.extConfig = nVar;
        this.timingProcessorConfig = list2;
        this.abilities = list3;
    }
}
