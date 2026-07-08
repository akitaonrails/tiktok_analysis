package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class RTCBitRateMap {

    @C09CT("xx1")
    public int xx_1;

    @C09CT("xx2")
    public int xx_2;

    @C09CT("xx3")
    public int xx_3;

    @C09CT("xx4")
    public int xx_4;

    public RTCBitRateMap() {
        this(0, 0, 0, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCBitRateMap(xx_1=");
        sbLIZ.append(this.xx_1);
        sbLIZ.append(", xx_2=");
        sbLIZ.append(this.xx_2);
        sbLIZ.append(", xx_3=");
        sbLIZ.append(this.xx_3);
        sbLIZ.append(", xx_4=");
        sbLIZ.append(this.xx_4);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCBitRateMap(int i, int i2, int i3, int i4) {
        this.xx_1 = i;
        this.xx_2 = i2;
        this.xx_3 = i3;
        this.xx_4 = i4;
    }
}
