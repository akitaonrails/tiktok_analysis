package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class HistorySessionShowInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("history_session")
    public final AdWebHistorySessionInfo historySession;

    public HistorySessionShowInfo(AdWebHistorySessionInfo adWebHistorySessionInfo) {
        this.historySession = adWebHistorySessionInfo;
    }
}
