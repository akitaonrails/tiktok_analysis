package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcError implements Serializable {

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final Object data;

    @C09CT("message")
    public final String message;

    public JsonRpcError() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcError)) {
            return false;
        }
        JsonRpcError jsonRpcError = (JsonRpcError) obj;
        return Intrinsics.LJFF(this.code, jsonRpcError.code) && Intrinsics.LJFF(this.message, jsonRpcError.message) && Intrinsics.LJFF(this.data, jsonRpcError.data);
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.data;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcError(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JsonRpcError(Integer num, String str, Object obj) {
        this.code = num;
        this.message = str;
        this.data = obj;
    }
}
