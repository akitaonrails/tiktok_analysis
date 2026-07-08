package com.ss.android.ugc.aweme.mvtemplate.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;

/* JADX INFO: loaded from: classes22.dex */
public final class MvDetailModel {
    public Integer LIZ;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("mv_info")
    public final MvModel mvInfo;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("template")
    public final TemplateResponseItem template;
}
