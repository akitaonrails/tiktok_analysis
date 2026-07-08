package com.ss.android.ugc.aweme.prop.model;

import X.C09CT;
import X.C0X12;
import X.InterfaceC2126708Uv;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class StickerPropAwemeList extends BaseResponse implements C0X12 {

    @C09CT("cursor")
    public long cursor;

    @C09CT("feed_session_id")
    public String feedSessionId;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("is_top")
    public boolean isTop;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("rid")
    public String requestId;

    @C09CT("aweme_list")
    @InterfaceC2126708Uv
    public List<Aweme> items = new ArrayList();

    @C09CT("draft_count")
    public Integer draftCount = -1;

    @C09CT("draft_query_id")
    public String draftQueryId = null;

    @Override // X.C0X12
    public final String getRequestId() {
        return this.requestId;
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
