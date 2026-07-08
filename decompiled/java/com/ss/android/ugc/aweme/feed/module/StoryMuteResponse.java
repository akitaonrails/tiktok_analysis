package com.ss.android.ugc.aweme.feed.module;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryMuteResponse implements Serializable {

    @C09CT("status_code")
    public final int code;

    @C09CT("status_msg")
    public final String msg;

    public StoryMuteResponse() {
        this(0, "");
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public StoryMuteResponse(int i, String str) {
        this.code = i;
        this.msg = str;
    }
}
