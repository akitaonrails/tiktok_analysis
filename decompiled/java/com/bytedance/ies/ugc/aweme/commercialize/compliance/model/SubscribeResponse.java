package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscribeResponse extends BaseResponse implements Serializable {

    @C09CT("content")
    public String content;

    @C09CT("contract_id")
    public final String contractId;

    @C09CT("custom_code")
    public Integer errorCode;

    @C09CT("subscribe_code")
    public Integer subscribeCode;

    public final String getContent() {
        return this.content;
    }

    public final String getContractId() {
        return this.contractId;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final Integer getSubscribeCode() {
        return this.subscribeCode;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public final void setSubscribeCode(Integer num) {
        this.subscribeCode = num;
    }

    public SubscribeResponse(Integer num, Integer num2, String str, String str2) {
        this.subscribeCode = num;
        this.errorCode = num2;
        this.content = str;
        this.contractId = str2;
    }
}
