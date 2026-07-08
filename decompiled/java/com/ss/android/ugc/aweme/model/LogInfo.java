package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LogInfo implements Serializable {

    @C09CT("refer")
    public final String refer;

    @C09CT("tag")
    public final String tag;

    public LogInfo() {
        this(null, null);
    }

    public LogInfo(String str, String str2) {
        this.refer = str;
        this.tag = str2;
    }
}
