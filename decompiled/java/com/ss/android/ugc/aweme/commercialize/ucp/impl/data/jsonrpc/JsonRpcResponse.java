package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcResponse<RESULT> implements Serializable {

    @C09CT("error")
    public final JsonRpcError error;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("jsonrpc")
    public final String jsonrpc;

    @C09CT("result")
    public final RESULT result;

    public JsonRpcResponse() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcResponse)) {
            return false;
        }
        JsonRpcResponse jsonRpcResponse = (JsonRpcResponse) obj;
        return Intrinsics.LJFF(this.jsonrpc, jsonRpcResponse.jsonrpc) && Intrinsics.LJFF(this.id, jsonRpcResponse.id) && Intrinsics.LJFF(this.result, jsonRpcResponse.result) && Intrinsics.LJFF(this.error, jsonRpcResponse.error);
    }

    public int hashCode() {
        String str = this.jsonrpc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RESULT result = this.result;
        int iHashCode3 = (iHashCode2 + (result == null ? 0 : result.hashCode())) * 31;
        JsonRpcError jsonRpcError = this.error;
        return iHashCode3 + (jsonRpcError != null ? jsonRpcError.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcResponse(jsonrpc=");
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

    public JsonRpcResponse(String str, String str2, RESULT result, JsonRpcError jsonRpcError) {
        this.jsonrpc = str;
        this.id = str2;
        this.result = result;
        this.error = jsonRpcError;
    }
}
