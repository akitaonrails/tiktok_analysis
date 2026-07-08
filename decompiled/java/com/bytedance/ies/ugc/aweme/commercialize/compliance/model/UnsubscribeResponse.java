package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class UnsubscribeResponse extends BaseResponse implements Serializable {

    @C09CT("cancel_subscribe_code")
    public Integer cancelSubscribeCode;

    public final Integer getCancelSubscribeCode() {
        return this.cancelSubscribeCode;
    }

    public UnsubscribeResponse(Integer num) {
        this.cancelSubscribeCode = num;
    }

    public final void setCancelSubscribeCode(Integer num) {
        this.cancelSubscribeCode = num;
    }
}
