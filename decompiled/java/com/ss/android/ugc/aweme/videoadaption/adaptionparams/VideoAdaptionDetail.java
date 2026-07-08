package com.ss.android.ugc.aweme.videoadaption.adaptionparams;

import X.C0RAA;
import X.C0T9Y;
import X.InterfaceC1604490rr5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class VideoAdaptionDetail implements Serializable {
    public C0T9Y context;
    public InterfaceC1604490rr5 params;
    public C0RAA result;

    public VideoAdaptionDetail() {
        this(null, null, null);
    }

    public final void setContext(C0T9Y c0t9y) {
        this.context = c0t9y;
    }

    public final void setParams(InterfaceC1604490rr5 interfaceC1604490rr5) {
        this.params = interfaceC1604490rr5;
    }

    public final void setResult(C0RAA c0raa) {
        this.result = c0raa;
    }

    public VideoAdaptionDetail(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        this.context = c0t9y;
        this.params = interfaceC1604490rr5;
        this.result = c0raa;
    }
}
