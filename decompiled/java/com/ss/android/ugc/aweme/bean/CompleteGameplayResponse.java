package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class CompleteGameplayResponse extends BaseResponse implements Serializable {

    @C09CT("base")
    public final CompleteGameplayBase base;

    @C09CT("triggerResultData")
    public final Object triggerResultData;

    public CompleteGameplayResponse() {
        this(null, null);
    }

    public final CompleteGameplayResponse copy(CompleteGameplayBase completeGameplayBase, Object obj) {
        return new CompleteGameplayResponse(completeGameplayBase, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteGameplayResponse)) {
            return false;
        }
        CompleteGameplayResponse completeGameplayResponse = (CompleteGameplayResponse) obj;
        return Intrinsics.LJFF(this.base, completeGameplayResponse.base) && Intrinsics.LJFF(this.triggerResultData, completeGameplayResponse.triggerResultData);
    }

    public int hashCode() {
        CompleteGameplayBase completeGameplayBase = this.base;
        int iHashCode = (completeGameplayBase == null ? 0 : completeGameplayBase.hashCode()) * 31;
        Object obj = this.triggerResultData;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompleteGameplayResponse(base=");
        sbLIZ.append(this.base);
        sbLIZ.append(", triggerResultData=");
        sbLIZ.append(this.triggerResultData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final CompleteGameplayBase getBase() {
        return this.base;
    }

    public final Object getTriggerResultData() {
        return this.triggerResultData;
    }

    public CompleteGameplayResponse(CompleteGameplayBase completeGameplayBase, Object obj) {
        this.base = completeGameplayBase;
        this.triggerResultData = obj;
    }
}
