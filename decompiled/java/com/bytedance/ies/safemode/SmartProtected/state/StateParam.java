package com.bytedance.ies.safemode.SmartProtected.state;

import X.C09CT;
import X.C09DE;

/* JADX INFO: loaded from: classes35.dex */
public class StateParam {

    @C09CT("flags")
    @C09DE
    public int flags;

    @C09CT("payload")
    @C09DE
    public int payload;

    public StateParam() {
        this(0, 0);
    }

    public StateParam(int i, int i2) {
        this.flags = i;
        this.payload = i2;
    }
}
