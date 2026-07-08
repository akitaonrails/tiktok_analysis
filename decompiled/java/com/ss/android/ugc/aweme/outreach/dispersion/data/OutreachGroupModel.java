package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class OutreachGroupModel {

    @C09CT("outreach_list")
    public final List<OutreachModel> outreachList;

    @C09CT("outreach_type")
    public final String outreachType;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachGroupModel(outreachType=");
        sbLIZ.append(this.outreachType);
        sbLIZ.append(", outreachList=");
        sbLIZ.append(this.outreachList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OutreachGroupModel(String str, List<OutreachModel> list) {
        this.outreachType = str;
        this.outreachList = list;
    }
}
