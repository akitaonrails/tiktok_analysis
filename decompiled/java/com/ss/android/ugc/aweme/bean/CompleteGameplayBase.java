package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class CompleteGameplayBase implements Serializable {

    @C09CT("StatusCode")
    public final Integer statusCode;

    @C09CT("StatusMessage")
    public final String statusMessage;

    public CompleteGameplayBase() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteGameplayBase)) {
            return false;
        }
        CompleteGameplayBase completeGameplayBase = (CompleteGameplayBase) obj;
        return Intrinsics.LJFF(this.statusCode, completeGameplayBase.statusCode) && Intrinsics.LJFF(this.statusMessage, completeGameplayBase.statusMessage);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompleteGameplayBase(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMessage=");
        sbLIZ.append(this.statusMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CompleteGameplayBase(Integer num, String str) {
        this.statusCode = num;
        this.statusMessage = str;
    }
}
