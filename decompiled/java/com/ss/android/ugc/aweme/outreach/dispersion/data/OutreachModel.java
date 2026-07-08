package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachModel {

    @C09CT("forbid_count")
    public final boolean forbidCount;

    @C09CT("key")
    public final String key;

    @C09CT("must_show")
    public final boolean mustShow;

    @C09CT("trigger_ids")
    public final List<String> triggerIds;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachModel(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", triggerIds=");
        sbLIZ.append(this.triggerIds);
        sbLIZ.append(", mustShow=");
        sbLIZ.append(this.mustShow);
        sbLIZ.append(", forbidCount=");
        sbLIZ.append(this.forbidCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OutreachModel(String str, List<String> list, boolean z, boolean z2) {
        this.key = str;
        this.triggerIds = list;
        this.mustShow = z;
        this.forbidCount = z2;
    }
}
