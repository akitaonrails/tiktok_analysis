package com.bytedance.android.livesdkapi.depend.model.report;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public class ReportCommitData {

    @C09CT("desc")
    public String desc;

    @C09CT("record_id")
    public long recordId;

    @C09CT("report_id")
    public long reportId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;
}
