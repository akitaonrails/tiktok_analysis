package com.bytedance.ropa.encrypt;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes11.dex */
public class EncryptResult {
    public final int code;
    public final String data;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EncryptResult{code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", data='");
        sbLIZ.append(this.data);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public EncryptResult(int i, String str) {
        this.code = i;
        this.data = str;
    }
}
