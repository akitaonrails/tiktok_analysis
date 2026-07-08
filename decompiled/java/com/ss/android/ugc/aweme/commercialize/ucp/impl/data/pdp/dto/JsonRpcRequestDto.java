package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcRequestDto implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("jsonrpc")
    public final String jsonrpc;

    @C09CT("method")
    public final String method;

    @C09CT("params")
    public final Map<String, Object> params;

    public JsonRpcRequestDto() {
        this("2.0", "1", "tools/call", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcRequestDto)) {
            return false;
        }
        JsonRpcRequestDto jsonRpcRequestDto = (JsonRpcRequestDto) obj;
        return Intrinsics.LJFF(this.jsonrpc, jsonRpcRequestDto.jsonrpc) && Intrinsics.LJFF(this.id, jsonRpcRequestDto.id) && Intrinsics.LJFF(this.method, jsonRpcRequestDto.method) && Intrinsics.LJFF(this.params, jsonRpcRequestDto.params);
    }

    public int hashCode() {
        int iHashCode = ((((this.jsonrpc.hashCode() * 31) + this.id.hashCode()) * 31) + this.method.hashCode()) * 31;
        Map<String, Object> map = this.params;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcRequestDto(jsonrpc=");
        sbLIZ.append(this.jsonrpc);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", method=");
        sbLIZ.append(this.method);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JsonRpcRequestDto(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.jsonrpc = str;
        this.id = str2;
        this.method = str3;
        this.params = map;
    }
}
