package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class PerfMetric implements Serializable {

    @C09CT("ai_lab_trans_time")
    public Integer aiLabTransTime;

    @C09CT("content_source")
    public String serverCacheType;

    @C09CT("server_trans_time")
    public Integer serverTransTime;

    public PerfMetric() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfMetric(serverCacheType=");
        sbLIZ.append(this.serverCacheType);
        sbLIZ.append(", serverTransTime=");
        sbLIZ.append(this.serverTransTime);
        sbLIZ.append(", aiLabTransTime=");
        sbLIZ.append(this.aiLabTransTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setAiLabTransTime(Integer num) {
        this.aiLabTransTime = num;
    }

    public final void setServerCacheType(String str) {
        this.serverCacheType = str;
    }

    public final void setServerTransTime(Integer num) {
        this.serverTransTime = num;
    }

    public PerfMetric(String str, Integer num, Integer num2) {
        this.serverCacheType = str;
        this.serverTransTime = num;
        this.aiLabTransTime = num2;
    }
}
