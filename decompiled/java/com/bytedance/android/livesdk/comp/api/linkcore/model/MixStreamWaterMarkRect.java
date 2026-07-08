package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes34.dex */
public final class MixStreamWaterMarkRect {
    public final double height;
    public final double left;
    public final double top;
    public final double width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStreamWaterMarkRect)) {
            return false;
        }
        MixStreamWaterMarkRect mixStreamWaterMarkRect = (MixStreamWaterMarkRect) obj;
        return Double.compare(this.left, mixStreamWaterMarkRect.left) == 0 && Double.compare(this.top, mixStreamWaterMarkRect.top) == 0 && Double.compare(this.width, mixStreamWaterMarkRect.width) == 0 && Double.compare(this.height, mixStreamWaterMarkRect.height) == 0;
    }

    public int hashCode() {
        return (((((C786410Ut5.X2(this.left) * 31) + C786410Ut5.X2(this.top)) * 31) + C786410Ut5.X2(this.width)) * 31) + C786410Ut5.X2(this.height);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStreamWaterMarkRect(left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MixStreamWaterMarkRect(double d, double d2, double d3, double d4) {
        this.left = d;
        this.top = d2;
        this.width = d3;
        this.height = d4;
    }
}
