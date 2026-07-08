package com.ss.android.ugc.aweme.creativedetail.datamodel;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes10.dex */
public final class CreativeToolDetailModel extends BaseResponse implements C0X12 {
    public String LL;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("detail_page_info")
    public final CreativeToolDetailPageInfo pageInfo;

    @Override // X.C0X12
    public final String getRequestId() {
        String str = this.LL;
        return str == null ? "" : str;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.LL = str;
    }
}
