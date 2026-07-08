package com.ss.android.ugc.aweme.mvtemplate.model;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class MvDetailListModel extends BaseResponse implements C0X12 {

    @C09CT("aweme_list")
    public ArrayList<Aweme> awemeList;

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public Boolean hasMore;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("rid")
    public String rid;

    @Override // X.C0X12
    public final String getRequestId() {
        return this.rid;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.rid = str;
    }
}
