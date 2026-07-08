package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoTNSBlock {

    @C09CT("roundId")
    public final long roundId;

    @C09CT("content")
    public final String tnsContent;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoTNSBlock)) {
            return false;
        }
        TakoTNSBlock takoTNSBlock = (TakoTNSBlock) obj;
        return this.roundId == takoTNSBlock.roundId && Intrinsics.LJFF(this.tnsContent, takoTNSBlock.tnsContent);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.roundId) * 31) + this.tnsContent.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoTNSBlock(roundId=");
        sbLIZ.append(this.roundId);
        sbLIZ.append(", tnsContent=");
        sbLIZ.append(this.tnsContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoTNSBlock() {
        this(-1L, "");
    }

    public TakoTNSBlock(long j, String str) {
        this.roundId = j;
        this.tnsContent = str;
    }
}
