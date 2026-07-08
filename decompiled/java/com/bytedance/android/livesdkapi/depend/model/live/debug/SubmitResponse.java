package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class SubmitResponse implements Serializable {

    @C09CT("success")
    public boolean success;

    public SubmitResponse(boolean z) {
        this.success = z;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }
}
