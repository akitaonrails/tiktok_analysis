package com.ss.android.ugc.aweme.now;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NowForcedVisibility implements Serializable {

    @C09CT("message")
    public String message;

    @C09CT("state")
    public int state;

    public NowForcedVisibility() {
        this(0, "");
    }

    public NowForcedVisibility(int i, String str) {
        this.state = i;
        this.message = str;
    }
}
