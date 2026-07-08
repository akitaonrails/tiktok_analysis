package com.ss.android.ugc.aweme.commercialize.tcm.push;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class BCVideosInPushMsg {
    public String LIZ;

    @C09CT("new_content_num")
    public final int newContentNum;

    @C09CT("update_time")
    public final long updateTime;

    public BCVideosInPushMsg() {
        this(null, 0, 0L);
    }

    public BCVideosInPushMsg(String str, int i, long j) {
        this.LIZ = str;
        this.newContentNum = i;
        this.updateTime = j;
    }
}
