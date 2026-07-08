package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import webcast.im.CohostContent;

/* JADX INFO: loaded from: classes.dex */
public final class BusinessContent {

    @C09CT("cohost_content")
    public CohostContent cohostContent;

    @C09CT("multi_live_content")
    public MultiLiveContent multiLiveContent;

    @C09CT("over_length")
    public long overLength;

    public BusinessContent() {
        this(0L, null, null);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.overLength) * 31;
        MultiLiveContent multiLiveContent = this.multiLiveContent;
        int iHashCode = (iY2 + (multiLiveContent == null ? 0 : multiLiveContent.hashCode())) * 31;
        CohostContent cohostContent = this.cohostContent;
        return iHashCode + (cohostContent != null ? cohostContent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessContent(overLength=");
        sbLIZ.append(this.overLength);
        sbLIZ.append(", multiLiveContent=");
        sbLIZ.append(this.multiLiveContent);
        sbLIZ.append(", cohostContent=");
        sbLIZ.append(this.cohostContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BusinessContent(long j, MultiLiveContent multiLiveContent, CohostContent cohostContent) {
        this.overLength = j;
        this.multiLiveContent = multiLiveContent;
        this.cohostContent = cohostContent;
    }
}
