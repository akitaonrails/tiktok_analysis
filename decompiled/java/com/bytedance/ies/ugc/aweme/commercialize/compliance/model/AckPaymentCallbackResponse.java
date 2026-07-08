package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class AckPaymentCallbackResponse extends BaseResponse implements Serializable {

    @C09CT("ack_msg")
    public final String ackMsg;

    @C09CT("ack_status")
    public final Integer ackStatus;

    @C09CT("subscription_phase")
    public final Integer subscriptionPhase;

    public AckPaymentCallbackResponse() {
        this(null, null, null);
    }

    public final String getAckMsg() {
        return this.ackMsg;
    }

    public final Integer getAckStatus() {
        return this.ackStatus;
    }

    public final Integer getSubscriptionPhase() {
        return this.subscriptionPhase;
    }

    public AckPaymentCallbackResponse(Integer num, Integer num2, String str) {
        this.subscriptionPhase = num;
        this.ackStatus = num2;
        this.ackMsg = str;
    }
}
