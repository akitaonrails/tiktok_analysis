package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PushHistoryInfo implements Serializable {

    @C09CT("biz_extra")
    public String bizExtraJsonStr;

    @C09CT("timestamp")
    public Long receiveTime;

    @C09CT("in_app_push_type")
    public int type;

    @C09CT("from_user_id")
    public long uid;

    public PushHistoryInfo() {
        this(0L, 0L, 0, "");
    }

    public final void setBizExtraJsonStr(String str) {
        this.bizExtraJsonStr = str;
    }

    public final void setReceiveTime(Long l) {
        this.receiveTime = l;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public PushHistoryInfo(Long l, long j, int i, String str) {
        this.receiveTime = l;
        this.uid = j;
        this.type = i;
        this.bizExtraJsonStr = str;
    }
}
