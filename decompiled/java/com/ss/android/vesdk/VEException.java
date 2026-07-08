package com.ss.android.vesdk;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public class VEException extends RuntimeException {
    public String msgDes;
    public int ret;

    public String getMsgDes() {
        return this.msgDes;
    }

    public int getRetCd() {
        return this.ret;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VEException(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VESDK exception ret: ");
        sbLIZ.append(i);
        sbLIZ.append("msg: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.ret = i;
        this.msgDes = str;
    }
}
