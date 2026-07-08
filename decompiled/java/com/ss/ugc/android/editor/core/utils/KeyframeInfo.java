package com.ss.ugc.android.editor.core.utils;

import X.C2188811AlT;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class KeyframeInfo {
    public final String filterType;
    public final BigInteger slotId;
    public final BigInteger trackId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyframeInfo)) {
            return false;
        }
        KeyframeInfo keyframeInfo = (KeyframeInfo) obj;
        return Intrinsics.LJFF(this.slotId, keyframeInfo.slotId) && Intrinsics.LJFF(this.trackId, keyframeInfo.trackId) && Intrinsics.LJFF(this.filterType, keyframeInfo.filterType);
    }

    public int hashCode() {
        return (((this.slotId.hashCode() * 31) + this.trackId.hashCode()) * 31) + this.filterType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyframeInfo(slotId=");
        sbLIZ.append(this.slotId);
        sbLIZ.append(", trackId=");
        sbLIZ.append(this.trackId);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KeyframeInfo(BigInteger bigInteger, BigInteger bigInteger2, String str) {
        this.slotId = bigInteger;
        this.trackId = bigInteger2;
        this.filterType = str;
    }
}
