package com.ss.android.ugc.aweme.report.model;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public class Report extends BaseResponse {
    public String getMessage() {
        return this.message;
    }

    public void setStatusMessage(String str) {
        this.message = str;
    }
}
