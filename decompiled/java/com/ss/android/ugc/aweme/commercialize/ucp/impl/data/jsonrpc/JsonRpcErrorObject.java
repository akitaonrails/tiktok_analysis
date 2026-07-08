package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class JsonRpcErrorObject implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("content")
    public final String content;

    @C09CT("continue_url")
    public final String continueUrl;

    public JsonRpcErrorObject() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcErrorObject)) {
            return false;
        }
        JsonRpcErrorObject jsonRpcErrorObject = (JsonRpcErrorObject) obj;
        return Intrinsics.LJFF(this.code, jsonRpcErrorObject.code) && Intrinsics.LJFF(this.content, jsonRpcErrorObject.content) && Intrinsics.LJFF(this.continueUrl, jsonRpcErrorObject.continueUrl);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.continueUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcErrorObject(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", continueUrl=");
        sbLIZ.append(this.continueUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JsonRpcErrorObject(String str, String str2, String str3) {
        this.code = str;
        this.content = str2;
        this.continueUrl = str3;
    }
}
