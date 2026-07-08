package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GetLiveBubbleResponse implements Serializable {

    @C09CT("data")
    public LiveBubbleData data;

    @C09CT("extra")
    public LiveBubbleExtra extra;

    public GetLiveBubbleResponse() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLiveBubbleResponse)) {
            return false;
        }
        GetLiveBubbleResponse getLiveBubbleResponse = (GetLiveBubbleResponse) obj;
        return Intrinsics.LJFF(this.data, getLiveBubbleResponse.data) && Intrinsics.LJFF(this.extra, getLiveBubbleResponse.extra);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetLiveBubbleResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setData(LiveBubbleData liveBubbleData) {
        this.data = liveBubbleData;
    }

    public final void setExtra(LiveBubbleExtra liveBubbleExtra) {
        this.extra = liveBubbleExtra;
    }

    public GetLiveBubbleResponse(LiveBubbleData liveBubbleData, LiveBubbleExtra liveBubbleExtra) {
        this.data = liveBubbleData;
        this.extra = liveBubbleExtra;
    }
}
