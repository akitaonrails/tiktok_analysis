package com.ss.android.ugc.aweme.fetch;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class OutreachFetchRequestBody implements Serializable {

    @C09CT("biz_condition")
    public String bizCondition;

    @C09CT("cross_outreach_signal")
    public String crossOutreachSignal;

    @C09CT("enable_outreach_types")
    public List<String> enableOutreachTypes;

    @C09CT("fetch_timing")
    public String fetchTiming;

    @C09CT("single_outreach_signal")
    public Map<String, OutreachCategoryParams> singleOutreachSignal;

    public OutreachFetchRequestBody() {
        this(null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachFetchRequestBody(fetchTiming=");
        sbLIZ.append(this.fetchTiming);
        sbLIZ.append(", enableOutreachTypes=");
        sbLIZ.append(this.enableOutreachTypes);
        sbLIZ.append(", crossOutreachSignal=");
        sbLIZ.append(this.crossOutreachSignal);
        sbLIZ.append(", singleOutreachSignal=");
        sbLIZ.append(this.singleOutreachSignal);
        sbLIZ.append(", bizCondition=");
        sbLIZ.append(this.bizCondition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBizCondition(String str) {
        this.bizCondition = str;
    }

    public final void setCrossOutreachSignal(String str) {
        this.crossOutreachSignal = str;
    }

    public final void setEnableOutreachTypes(List<String> list) {
        this.enableOutreachTypes = list;
    }

    public final void setFetchTiming(String str) {
        this.fetchTiming = str;
    }

    public final void setSingleOutreachSignal(Map<String, OutreachCategoryParams> map) {
        this.singleOutreachSignal = map;
    }

    public OutreachFetchRequestBody(String str, List<String> list, String str2, Map<String, OutreachCategoryParams> map, String str3) {
        this.fetchTiming = str;
        this.enableOutreachTypes = list;
        this.crossOutreachSignal = str2;
        this.singleOutreachSignal = map;
        this.bizCondition = str3;
    }
}
