package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class TimeWindow {

    @C09CT("size")
    public final Integer size;

    @C09CT("type")
    public final String type;

    public TimeWindow() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeWindow(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TimeWindow(String str, Integer num) {
        this.type = str;
        this.size = num;
    }
}
