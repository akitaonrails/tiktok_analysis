package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AlgoResponse {

    @C09CT("algo_status_code")
    public final int algoStatusCode;

    @C09CT("algo_status_message")
    public final String algoStatusMessage;

    @C09CT("data")
    public final DataBlock data;

    public AlgoResponse() {
        this(0, "", new DataBlock(null, 1, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgoResponse)) {
            return false;
        }
        AlgoResponse algoResponse = (AlgoResponse) obj;
        return this.algoStatusCode == algoResponse.algoStatusCode && Intrinsics.LJFF(this.algoStatusMessage, algoResponse.algoStatusMessage) && Intrinsics.LJFF(this.data, algoResponse.data);
    }

    public final int hashCode() {
        return (((this.algoStatusCode * 31) + this.algoStatusMessage.hashCode()) * 31) + this.data.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlgoResponse(algoStatusCode=");
        sbLIZ.append(this.algoStatusCode);
        sbLIZ.append(", algoStatusMessage=");
        sbLIZ.append(this.algoStatusMessage);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AlgoResponse(int i, String str, DataBlock dataBlock) {
        this.algoStatusCode = i;
        this.algoStatusMessage = str;
        this.data = dataBlock;
    }
}
