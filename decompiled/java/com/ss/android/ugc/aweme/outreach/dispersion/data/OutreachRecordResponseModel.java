package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachRecordResponseModel implements Serializable {

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    @C09CT("result")
    public final OutreachRecordResultModel result;

    @C09CT("status_code")
    public final Integer statusCode;

    public OutreachRecordResponseModel(Integer num, Integer num2, String str, OutreachRecordResultModel outreachRecordResultModel) {
        this.code = num;
        this.statusCode = num2;
        this.message = str;
        this.result = outreachRecordResultModel;
    }
}
