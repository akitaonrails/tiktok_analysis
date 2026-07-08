package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CanvasInfo {

    @C09CT("alignMode")
    public final String alignMode;

    @C09CT("canvasRatio")
    public final Float canvasRatio;

    @C09CT("height")
    public final Integer height;

    @C09CT("width")
    public final Integer width;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanvasInfo)) {
            return false;
        }
        CanvasInfo canvasInfo = (CanvasInfo) obj;
        return Intrinsics.LJFF(this.width, canvasInfo.width) && Intrinsics.LJFF(this.height, canvasInfo.height) && Intrinsics.LJFF(this.alignMode, canvasInfo.alignMode) && Intrinsics.LJFF(this.canvasRatio, canvasInfo.canvasRatio);
    }

    public final int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.alignMode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.canvasRatio;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CanvasInfo(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", alignMode=");
        sbLIZ.append(this.alignMode);
        sbLIZ.append(", canvasRatio=");
        sbLIZ.append(this.canvasRatio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CanvasInfo(Integer num, Integer num2, String str, Float f) {
        this.width = num;
        this.height = num2;
        this.alignMode = str;
        this.canvasRatio = f;
    }
}
