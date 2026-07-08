package com.ss.android.ugc.aweme.duet.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes30.dex */
public final class DuetDetailModel {

    @C09CT("status_code")
    public final Integer code;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("page_title")
    public final String pageTitle;

    @C09CT("remind_type")
    public final Integer remindType;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("video_count")
    public final long videoCount;
}
