package com.ss.android.ugc.aweme.report;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachFlowInfo implements Serializable {

    @C09CT("outreach_info_list")
    public final List<OutreachFlowReportItem> outreachInfoList;

    public OutreachFlowInfo() {
        this(null);
    }

    public OutreachFlowInfo(List<OutreachFlowReportItem> list) {
        this.outreachInfoList = list;
    }
}
