package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C09CT;
import X.C0X12;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TopHistoryWordsResponse implements C0X12, InterfaceC1201180hMa {

    @C09CT("data")
    public final List<TopHistoryWord> data;

    @C09CT("errno")
    public final int errno;

    @C09CT("log_id")
    public String logId;

    @C09CT("msg")
    public final String msg;
    public String requestId = "";
    public C1494600ozq<?> requestInfo;

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public final List<TopHistoryWord> getData() {
        return this.data;
    }

    public final int getErrno() {
        return this.errno;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMsg() {
        return this.msg;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final void setLogId(String str) {
        this.logId = str;
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
