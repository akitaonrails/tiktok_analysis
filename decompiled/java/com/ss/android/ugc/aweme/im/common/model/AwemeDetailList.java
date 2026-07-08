package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AwemeDetailList extends BaseResponse {

    @C09CT("aweme_details")
    public List<? extends Aweme> awemeList;

    @C09CT("aweme_status")
    public List<AwemeStatusBean> awemeStatus;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("rid")
    public String requestId;
}
