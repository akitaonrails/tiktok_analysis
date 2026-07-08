package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C09CT;
import X.C0X12;
import X.C1201190hMb;
import X.C1494600ozq;
import X.InterfaceC1201180hMa;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SuggestWordResponse implements C0X12, InterfaceC1201180hMa {

    @C09CT("config")
    public Config config;

    @C09CT("data")
    public final List<TypeWords> data;

    @C09CT("errno")
    public final int errno;

    @C09CT("extra")
    public Extra extra;

    @C09CT("log_id")
    public String logId;

    @C09CT("msg")
    public final String msg;

    @C09CT("qrec_virtual_enable")
    public String qrecVirtualEnable;
    public String requestId = "";
    public C1494600ozq<?> requestInfo;

    @C09CT("top_history_words")
    public List<TopHistoryWord> topHistoryWords;

    @Override // X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public static final class Config implements Serializable {

        @C09CT("history_display_num")
        public int historyDisplayNum = 3;

        public final int getHistoryDisplayNum() {
            return this.historyDisplayNum;
        }

        public final void setHistoryDisplayNum(int i) {
            this.historyDisplayNum = i;
        }
    }

    public final Config getConfig() {
        return this.config;
    }

    public final List<TypeWords> getData() {
        return this.data;
    }

    public final int getErrno() {
        return this.errno;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getQrecVirtualEnable() {
        return this.qrecVirtualEnable;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final List<TopHistoryWord> getTopHistoryWords() {
        return this.topHistoryWords;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Extra implements Serializable {

        @C09CT("call_per_refresh")
        public String callPerRefresh;

        @C09CT("time_cost_log_pb")
        public Map<String, String> timingLog;

        public final String getCallPerRefresh() {
            return this.callPerRefresh;
        }

        public final Map<String, String> getTimingLog() {
            return this.timingLog;
        }

        public final void setCallPerRefresh(String str) {
            this.callPerRefresh = str;
        }

        public final void setTimingLog(Map<String, String> map) {
            this.timingLog = map;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SuggestWordResponse) || !Intrinsics.LJFF(this.data, ((SuggestWordResponse) obj).data)) {
            return false;
        }
        return true;
    }

    public final void setConfig(Config config) {
        this.config = config;
    }

    public final void setExtra(Extra extra) {
        this.extra = extra;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setQrecVirtualEnable(String str) {
        this.qrecVirtualEnable = str;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.requestInfo = c1494600ozq;
    }

    public final void setTopHistoryWords(List<TopHistoryWord> list) {
        this.topHistoryWords = list;
    }
}
