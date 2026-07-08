package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class LogPbBean implements Serializable {

    @C09CT("impr_id")
    public final String imprId;

    public LogPbBean() {
        this(null);
    }

    public LogPbBean(String str) {
        this.imprId = str;
    }
}
