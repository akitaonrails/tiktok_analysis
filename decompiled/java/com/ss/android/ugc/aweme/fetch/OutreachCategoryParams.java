package com.ss.android.ugc.aweme.fetch;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OutreachCategoryParams implements Serializable {

    @C09CT("outreach_signal")
    public String bizCommonParam;

    @C09CT("outreach_key_signal")
    public Map<String, String> bizFeatureParam;

    public OutreachCategoryParams() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachCategoryParams(bizCommonParam=");
        sbLIZ.append(this.bizCommonParam);
        sbLIZ.append(", bizFeatureParam=");
        sbLIZ.append(this.bizFeatureParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBizCommonParam(String str) {
        this.bizCommonParam = str;
    }

    public final void setBizFeatureParam(Map<String, String> map) {
        this.bizFeatureParam = map;
    }

    public OutreachCategoryParams(String str, Map<String, String> map) {
        this.bizCommonParam = str;
        this.bizFeatureParam = map;
    }
}
