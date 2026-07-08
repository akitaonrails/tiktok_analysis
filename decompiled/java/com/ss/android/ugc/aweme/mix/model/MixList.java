package com.ss.android.ugc.aweme.mix.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MixList implements Serializable {

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("mix_list")
    public List<MixStruct> mixList;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public final long getCursor() {
        return this.cursor;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<MixStruct> getMixList() {
        return this.mixList;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMixList(List<MixStruct> list) {
        this.mixList = list;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
