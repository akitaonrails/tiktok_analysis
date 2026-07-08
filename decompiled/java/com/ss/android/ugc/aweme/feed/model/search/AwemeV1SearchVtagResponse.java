package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AwemeV1SearchVtagResponse {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("tags")
    public final List<VTagStruct> tags;

    @C09CT("tako_bubble")
    public final TakoBubbleStruct takoBubbleData;

    public AwemeV1SearchVtagResponse() {
        this(new ArrayList(), null, -1, "", null);
    }

    public AwemeV1SearchVtagResponse(List<VTagStruct> list, TakoBubbleStruct takoBubbleStruct, int i, String str, LogPbBean logPbBean) {
        this.tags = list;
        this.takoBubbleData = takoBubbleStruct;
        this.statusCode = i;
        this.statusMsg = str;
        this.logPb = logPbBean;
    }
}
