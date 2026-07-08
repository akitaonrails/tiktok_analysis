package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class ClearHistory extends BaseResponse implements Serializable {

    @C09CT("submitted_time")
    public Integer submittedTime;

    public ClearHistory() {
        this(null);
    }

    public final Integer getSubmittedTime() {
        return this.submittedTime;
    }

    public ClearHistory(Integer num) {
        this.submittedTime = num;
    }

    public final void setSubmittedTime(Integer num) {
        this.submittedTime = num;
    }
}
