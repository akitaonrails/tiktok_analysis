package com.ss.android.ugc.aweme.websocket.api.data;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class RequestLog {

    @C09CT("base")
    public Base base;

    @C09CT("nqe")
    public Nqe nqe;

    @C09CT("other")
    public Other other;

    public RequestLog() {
        this(null, null, null);
    }

    public RequestLog(Base base, Other other, Nqe nqe) {
        this.base = base;
        this.other = other;
        this.nqe = nqe;
    }
}
