package com.ss.android.ugc.tools.chat.input.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ConvContext {

    @C09CT("conv_id")
    public final String convId;

    @C09CT("entrance")
    public final int entranceType;

    public ConvContext() {
        this("", 1);
    }

    public ConvContext(String str, int i) {
        this.convId = str;
        this.entranceType = i;
    }
}
