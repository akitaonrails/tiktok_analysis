package com.ss.android.ugc.aweme.innerpush.model;

import X.C09CT;
import X.EnumC19330610jw;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PushCheckResponse extends BaseResponse implements Serializable {

    @C09CT("check_result")
    public Integer checkResult;

    @C09CT("push_id")
    public Long pushId;

    public PushCheckResponse() {
        this(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(EnumC19330610jw.PASS.getValue()));
    }

    public final Integer getCheckResult() {
        return this.checkResult;
    }

    public final Long getPushId() {
        return this.pushId;
    }

    public final void setCheckResult(Integer num) {
        this.checkResult = num;
    }

    public final void setPushId(Long l) {
        this.pushId = l;
    }

    public PushCheckResponse(Long l, Integer num) {
        this.pushId = l;
        this.checkResult = num;
    }
}
