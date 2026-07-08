package com.ss.android.ugc.aweme.pns.agegate.network;

import X.C09CT;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public class BaseResponse implements Serializable {

    @C09CT("feedback")
    public final PNSFeedbackModel ageGateFeedback;

    @C09CT("status_code")
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    public BaseResponse() {
        this(0, "", null);
    }

    public final PNSFeedbackModel getAgeGateFeedback() {
        return this.ageGateFeedback;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public BaseResponse(int i, String str, PNSFeedbackModel pNSFeedbackModel) {
        this.status_code = i;
        this.status_msg = str;
        this.ageGateFeedback = pNSFeedbackModel;
    }
}
