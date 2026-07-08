package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class HistorySessionInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("show_session")
    public final HistorySessionShowInfo showSession;

    public HistorySessionInfo(String str, HistorySessionShowInfo historySessionShowInfo) {
        this.sessionId = str;
        this.showSession = historySessionShowInfo;
    }
}
