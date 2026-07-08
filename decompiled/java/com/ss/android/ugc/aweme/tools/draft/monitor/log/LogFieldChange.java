package com.ss.android.ugc.aweme.tools.draft.monitor.log;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class LogFieldChange {
    public static final int $stable = 8;

    @C09CT("newValue")
    public final Object newValue;

    @C09CT("oldValue")
    public final Object oldValue;

    @C09CT("path")
    public final String path;

    public LogFieldChange(String str, Object obj, Object obj2) {
        this.path = str;
        this.oldValue = obj;
        this.newValue = obj2;
    }
}
