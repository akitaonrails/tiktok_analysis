package com.ss.ugc.clientai.core.api.meta;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ReturnCode {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("code")
    public int code;

    @C09CT("sequence_index")
    public int sequenceIndex;

    public ReturnCode() {
        this(-1, -1);
    }

    public ReturnCode(int i, int i2) {
        this.code = i;
        this.sequenceIndex = i2;
    }
}
