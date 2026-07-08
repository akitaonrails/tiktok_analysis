package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AlgoRaw {

    @C09CT("algo_param")
    public final String algoParam;

    @C09CT("req_json")
    public final String reqJson;

    @C09CT("req_key")
    public final String reqKey;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgoRaw)) {
            return false;
        }
        AlgoRaw algoRaw = (AlgoRaw) obj;
        return Intrinsics.LJFF(this.reqKey, algoRaw.reqKey) && Intrinsics.LJFF(this.reqJson, algoRaw.reqJson) && Intrinsics.LJFF(this.algoParam, algoRaw.algoParam);
    }

    public final int hashCode() {
        return (((this.reqKey.hashCode() * 31) + this.reqJson.hashCode()) * 31) + this.algoParam.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlgoRaw(reqKey=");
        sbLIZ.append(this.reqKey);
        sbLIZ.append(", reqJson=");
        sbLIZ.append(this.reqJson);
        sbLIZ.append(", algoParam=");
        sbLIZ.append(this.algoParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AlgoRaw() {
        this("", "", "");
    }

    public AlgoRaw(String str, String str2, String str3) {
        this.reqKey = str;
        this.reqJson = str2;
        this.algoParam = str3;
    }
}
