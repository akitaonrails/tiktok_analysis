package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.metric;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class LogItem {

    @C09CT("event")
    public final String event;

    @C09CT("newState")
    public final State newState;

    @C09CT("oldState")
    public final State oldState;

    public LogItem(String str, State state, State state2) {
        this.event = str;
        this.oldState = state;
        this.newState = state2;
    }
}
