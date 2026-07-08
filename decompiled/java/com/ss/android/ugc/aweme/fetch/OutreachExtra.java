package com.ss.android.ugc.aweme.fetch;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class OutreachExtra implements Serializable {

    @C09CT("logid")
    public String logId;

    public OutreachExtra() {
        this(null);
    }

    public OutreachExtra(String str) {
        this.logId = str;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }
}
