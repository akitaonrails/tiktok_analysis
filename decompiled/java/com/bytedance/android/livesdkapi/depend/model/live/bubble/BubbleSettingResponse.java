package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class BubbleSettingResponse implements Serializable {

    @C09CT("data")
    public BubbleSettingData data;

    @C09CT("extra")
    public BubbleSettingExtra extra;

    public BubbleSettingResponse() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleSettingResponse)) {
            return false;
        }
        BubbleSettingResponse bubbleSettingResponse = (BubbleSettingResponse) obj;
        return Intrinsics.LJFF(this.data, bubbleSettingResponse.data) && Intrinsics.LJFF(this.extra, bubbleSettingResponse.extra);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleSettingResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setData(BubbleSettingData bubbleSettingData) {
        this.data = bubbleSettingData;
    }

    public final void setExtra(BubbleSettingExtra bubbleSettingExtra) {
        this.extra = bubbleSettingExtra;
    }

    public BubbleSettingResponse(BubbleSettingData bubbleSettingData, BubbleSettingExtra bubbleSettingExtra) {
        this.data = bubbleSettingData;
        this.extra = bubbleSettingExtra;
    }
}
