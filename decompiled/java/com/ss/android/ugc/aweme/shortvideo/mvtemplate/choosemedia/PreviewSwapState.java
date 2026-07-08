package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PreviewSwapState implements C004I {
    public static final int $stable = 0;
    public final Integer from;
    public final Integer to;
    public final long value;

    public final PreviewSwapState copy(Integer num, Integer num2, long j) {
        return new PreviewSwapState(num, num2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewSwapState)) {
            return false;
        }
        PreviewSwapState previewSwapState = (PreviewSwapState) obj;
        return Intrinsics.LJFF(this.from, previewSwapState.from) && Intrinsics.LJFF(this.to, previewSwapState.to) && this.value == previewSwapState.value;
    }

    public int hashCode() {
        Integer num = this.from;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.to;
        return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.value);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewSwapState(from=");
        sbLIZ.append(this.from);
        sbLIZ.append(", to=");
        sbLIZ.append(this.to);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final Integer getTo() {
        return this.to;
    }

    public final long getValue() {
        return this.value;
    }

    public PreviewSwapState(Integer num, Integer num2, long j) {
        this.from = num;
        this.to = num2;
        this.value = j;
    }
}
