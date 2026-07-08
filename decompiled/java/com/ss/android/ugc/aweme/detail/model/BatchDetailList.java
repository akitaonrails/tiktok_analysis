package com.ss.android.ugc.aweme.detail.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BatchDetailList extends BaseResponse {

    @C09CT("aweme_details")
    public List<Aweme> items;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("rid")
    public String requestId;
}
