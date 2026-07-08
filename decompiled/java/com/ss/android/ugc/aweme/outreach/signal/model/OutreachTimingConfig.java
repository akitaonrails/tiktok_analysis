package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class OutreachTimingConfig {

    @C09CT("timing_outreach_map")
    public final List<TimingOutreachEntry> outreachTimingConfig;

    public OutreachTimingConfig() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachTimingConfig(outreachTimingConfig=");
        sbLIZ.append(this.outreachTimingConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OutreachTimingConfig(List<TimingOutreachEntry> list) {
        this.outreachTimingConfig = list;
    }
}
