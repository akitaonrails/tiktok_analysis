package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcResponseDto implements Serializable {

    @C09CT("error")
    public final JsonRpcErrorDto error;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("jsonrpc")
    public final String jsonrpc;

    @C09CT("result")
    public final JsonRpcResultDto result;

    public JsonRpcResponseDto() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcResponseDto)) {
            return false;
        }
        JsonRpcResponseDto jsonRpcResponseDto = (JsonRpcResponseDto) obj;
        return Intrinsics.LJFF(this.jsonrpc, jsonRpcResponseDto.jsonrpc) && Intrinsics.LJFF(this.id, jsonRpcResponseDto.id) && Intrinsics.LJFF(this.result, jsonRpcResponseDto.result) && Intrinsics.LJFF(this.error, jsonRpcResponseDto.error);
    }

    public int hashCode() {
        String str = this.jsonrpc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        JsonRpcResultDto jsonRpcResultDto = this.result;
        int iHashCode3 = (iHashCode2 + (jsonRpcResultDto == null ? 0 : jsonRpcResultDto.hashCode())) * 31;
        JsonRpcErrorDto jsonRpcErrorDto = this.error;
        return iHashCode3 + (jsonRpcErrorDto != null ? jsonRpcErrorDto.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcResponseDto(jsonrpc=");
        sbLIZ.append(this.jsonrpc);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JsonRpcResponseDto(String str, String str2, JsonRpcResultDto jsonRpcResultDto, JsonRpcErrorDto jsonRpcErrorDto) {
        this.jsonrpc = str;
        this.id = str2;
        this.result = jsonRpcResultDto;
        this.error = jsonRpcErrorDto;
    }
}
