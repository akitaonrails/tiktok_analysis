package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public final class SessionInfo implements Serializable {

    @C09CT("expire_time")
    public final Long expireTime;

    @C09CT("session_id")
    public final String sessionId;

    public SessionInfo() {
        this("", null);
    }

    public SessionInfo(String str, Long l) {
        this.sessionId = str;
        this.expireTime = l;
    }
}
