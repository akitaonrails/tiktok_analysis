package com.bytedance.applog.priority;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes32.dex */
public class PriorityHttpResponse {
    public final int code;
    public final String data;
    public final String errMsg;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code: ");
        sbLIZ.append(this.code);
        sbLIZ.append(", errMsg: ");
        sbLIZ.append(this.errMsg);
        sbLIZ.append(", data: ");
        sbLIZ.append(this.data);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public PriorityHttpResponse(int i, String str, String str2) {
        this.code = i;
        this.errMsg = str;
        this.data = str2;
    }
}
