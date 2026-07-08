package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import X.C0X12;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ExploreCustomTopicsResponse extends BaseResponse implements C0X12, InterfaceC1201180hMa, Serializable {

    @C09CT("custom_topics")
    public List<ExploreCustomTopicResponse> items;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("rid")
    public String requestId;
    public transient C1494600ozq<?> requestInfo;

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    @Override // X.C0X12
    public String getRequestId() {
        String imprId = this.requestId;
        LogPbBean logPbBean = this.logPb;
        if (imprId == null || imprId.length() == 0) {
            if (logPbBean == null) {
                return "";
            }
            imprId = logPbBean.getImprId();
        }
        return imprId == null ? "" : imprId;
    }

    public final List<ExploreCustomTopicResponse> getItems() {
        return this.items;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final void setItems(List<ExploreCustomTopicResponse> list) {
        this.items = list;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.requestInfo = c1494600ozq;
    }
}
