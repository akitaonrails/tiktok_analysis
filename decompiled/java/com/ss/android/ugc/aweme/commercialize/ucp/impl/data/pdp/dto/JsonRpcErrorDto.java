package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcErrorDto implements Serializable {

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    public JsonRpcErrorDto() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcErrorDto)) {
            return false;
        }
        JsonRpcErrorDto jsonRpcErrorDto = (JsonRpcErrorDto) obj;
        return Intrinsics.LJFF(this.code, jsonRpcErrorDto.code) && Intrinsics.LJFF(this.message, jsonRpcErrorDto.message);
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcErrorDto(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JsonRpcErrorDto(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}
