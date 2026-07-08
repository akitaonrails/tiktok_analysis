package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CompleteGameplayRequestBody implements Serializable {

    @C09CT("payload")
    public final Object payload;

    public CompleteGameplayRequestBody() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompleteGameplayRequestBody) && Intrinsics.LJFF(this.payload, ((CompleteGameplayRequestBody) obj).payload);
    }

    public int hashCode() {
        Object obj = this.payload;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompleteGameplayRequestBody(payload=");
        sbLIZ.append(this.payload);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CompleteGameplayRequestBody(Object obj) {
        this.payload = obj;
    }
}
