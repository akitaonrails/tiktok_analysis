package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcRequest<PARAMS> implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String _id;

    @C09CT("method")
    public final String _method;

    @C09CT("jsonrpc")
    public final String jsonrpc;

    @C09CT("params")
    public final PARAMS params;

    public JsonRpcRequest() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcRequest)) {
            return false;
        }
        JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) obj;
        return Intrinsics.LJFF(this._method, jsonRpcRequest._method) && Intrinsics.LJFF(this._id, jsonRpcRequest._id) && Intrinsics.LJFF(this.params, jsonRpcRequest.params);
    }

    public int hashCode() {
        String str = this._method;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PARAMS params = this.params;
        return iHashCode2 + (params != null ? params.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcRequest(_method=");
        sbLIZ.append(this._method);
        sbLIZ.append(", _id=");
        sbLIZ.append(this._id);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getId() {
        String str = this._id;
        return str == null ? "" : str;
    }

    public final String getMethod() {
        String str = this._method;
        return str == null ? "" : str;
    }

    public JsonRpcRequest(String str, String str2, PARAMS params) {
        this._method = str;
        this._id = str2;
        this.params = params;
        this.jsonrpc = "2.0";
    }
}
