package com.ss.android.ugc.aweme.bubble.record;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class BubbleRecord {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("dismiss_time")
    public final long dismissTime;

    @C09CT("show_time")
    public final long showTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public BubbleRecord() {
        this(0L, 0L, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleRecord(showTime=");
        sbLIZ.append(this.showTime);
        sbLIZ.append(", dismissTime=");
        sbLIZ.append(this.dismissTime);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BubbleRecord(long j, long j2, int i) {
        this.showTime = j;
        this.dismissTime = j2;
        this.status = i;
    }
}
