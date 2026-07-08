package com.ss.android.ugc.aweme.footnote.detail.repo;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FootNoteFeedItemList implements C0X12 {

    @C09CT("extra")
    public Extra extra;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("awemes")
    public List<Aweme> items;

    @C09CT("log_pb")
    public LogPbBean logPb;
    public String requestId;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("status_code")
    public int statusCode = -1;

    @C09CT("status_msg")
    public String statusMsg;

    @Override // X.C0X12
    public String getRequestId() {
        String imprId;
        String str = this.requestId;
        if (str != null) {
            return str;
        }
        LogPbBean logPbBean = this.logPb;
        return (logPbBean == null || (imprId = logPbBean.getImprId()) == null) ? "" : imprId;
    }

    public final boolean isHasMore() {
        return this.hasMore == 1;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setItems(List<Aweme> list) {
        this.items = list;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
