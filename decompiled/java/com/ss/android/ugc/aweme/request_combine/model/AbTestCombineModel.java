package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.k;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AbTestCombineModel extends BaseCombineMode {

    @C09CT("body")
    public k abTestResponse;

    public final AbTestCombineModel copy(k kVar) {
        return new AbTestCombineModel(kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbTestCombineModel) && Intrinsics.LJFF(this.abTestResponse, ((AbTestCombineModel) obj).abTestResponse);
    }

    public int hashCode() {
        return this.abTestResponse.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbTestCombineModel(abTestResponse=");
        sbLIZ.append(this.abTestResponse);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final k getAbTestResponse() {
        return this.abTestResponse;
    }

    public AbTestCombineModel(k kVar) {
        this.abTestResponse = kVar;
    }

    public final void setAbTestResponse(k kVar) {
        this.abTestResponse = kVar;
    }
}
