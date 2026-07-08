package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.RelatedAweme;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class ExploreRelatedAwemeList extends BaseResponse implements C0X12 {

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("aweme_infos")
    public List<? extends RelatedAweme> relatedAwemes;

    @C09CT("rid")
    public String requestId;

    @Override // X.C0X12
    public final String getRequestId() {
        String str = this.requestId;
        if (str == null || str.length() == 0) {
            LogPbBean logPbBean = this.logPb;
            this.requestId = logPbBean == null ? "" : logPbBean.getImprId();
        }
        return this.requestId;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
