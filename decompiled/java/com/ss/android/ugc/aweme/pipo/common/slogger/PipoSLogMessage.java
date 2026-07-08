package com.ss.android.ugc.aweme.pipo.common.slogger;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoSLogMessage {

    @C09CT("action")
    public final String action;

    @C09CT("event")
    public final String event;

    @C09CT("data")
    public final Object msgContent;

    public PipoSLogMessage() {
        this(null, null, null);
    }

    public PipoSLogMessage(String str, String str2, Object obj) {
        this.action = str;
        this.event = str2;
        this.msgContent = obj;
    }
}
