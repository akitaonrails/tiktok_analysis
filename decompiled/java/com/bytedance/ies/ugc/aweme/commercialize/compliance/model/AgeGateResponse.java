package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class AgeGateResponse extends BaseResponse implements Serializable {

    @C09CT("is_adult")
    public Boolean isAdult;

    public AgeGateResponse() {
        this(Boolean.FALSE);
    }

    public final Boolean isAdult() {
        return this.isAdult;
    }

    public AgeGateResponse(Boolean bool) {
        this.isAdult = bool;
    }

    public final void setAdult(Boolean bool) {
        this.isAdult = bool;
    }
}
