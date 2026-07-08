package com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.models;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class WTVValidationRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("rec_reason")
    public final RecReasonsStruct recReasonsStruct;

    public WTVValidationRequest() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WTVValidationRequest) && Intrinsics.LJFF(this.recReasonsStruct, ((WTVValidationRequest) obj).recReasonsStruct);
    }

    public int hashCode() {
        RecReasonsStruct recReasonsStruct = this.recReasonsStruct;
        if (recReasonsStruct == null) {
            return 0;
        }
        return recReasonsStruct.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WTVValidationRequest(recReasonsStruct=");
        sbLIZ.append(this.recReasonsStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WTVValidationRequest(RecReasonsStruct recReasonsStruct) {
        this.recReasonsStruct = recReasonsStruct;
    }
}
