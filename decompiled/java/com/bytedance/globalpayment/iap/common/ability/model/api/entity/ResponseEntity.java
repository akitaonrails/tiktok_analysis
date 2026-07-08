package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes28.dex */
public class ResponseEntity {

    @JsonName("error_code")
    public int errorCode;

    @JsonName("message")
    public String message;
    public String orderIdFromUploadTokenAPI;
    public int retryCount;

    public boolean isSuccess() {
        return this.errorCode == 0 && TextUtils.equals("success", this.message);
    }

    public boolean isFailure() {
        return !isSuccess();
    }

    public String getOrderIdByUploadToken() {
        return this.orderIdFromUploadTokenAPI;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public ResponseEntity setOrderIdByUploadTokenResult(String str) {
        this.orderIdFromUploadTokenAPI = str;
        return this;
    }

    public void setRetryCount(int i) {
        this.retryCount = i;
    }
}
