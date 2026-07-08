package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.jsonrpc;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class JsonRpcToolParams<ARGUMENTS> implements Serializable {

    @C09CT("name")
    public final String _name;

    @C09CT("arguments")
    public final ARGUMENTS arguments;

    public JsonRpcToolParams() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcToolParams)) {
            return false;
        }
        JsonRpcToolParams jsonRpcToolParams = (JsonRpcToolParams) obj;
        return Intrinsics.LJFF(this._name, jsonRpcToolParams._name) && Intrinsics.LJFF(this.arguments, jsonRpcToolParams.arguments);
    }

    public int hashCode() {
        String str = this._name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ARGUMENTS arguments = this.arguments;
        return iHashCode + (arguments != null ? arguments.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcToolParams(_name=");
        sbLIZ.append(this._name);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getName() {
        String str = this._name;
        return str == null ? "" : str;
    }

    public JsonRpcToolParams(String str, ARGUMENTS arguments) {
        this._name = str;
        this.arguments = arguments;
    }
}
