package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("session_id")
    public final String sessionId;

    public SessionInfo(String str) {
        this.sessionId = str;
    }
}
