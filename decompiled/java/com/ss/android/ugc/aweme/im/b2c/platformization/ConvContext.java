package com.ss.android.ugc.aweme.im.b2c.platformization;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ConvContext {

    @C09CT("conv_id")
    public final String convId;

    @C09CT("entrance")
    public final int entranceType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvContext)) {
            return false;
        }
        ConvContext convContext = (ConvContext) obj;
        return Intrinsics.LJFF(this.convId, convContext.convId) && this.entranceType == convContext.entranceType;
    }

    public ConvContext() {
        this("", 1);
    }

    public ConvContext(String str, int i) {
        this.convId = str;
        this.entranceType = i;
    }
}
