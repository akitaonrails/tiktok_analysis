package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class KaraokeRedDotMessage extends AbstractC1136060ffY {

    @C09CT("host_sing_req_cumulative_count")
    public long hostSingReqCumulativeCount;

    @C09CT("you_sing_req_cumulative_count")
    public long youSingReqCumulativeCount;

    public KaraokeRedDotMessage() {
        this.type = C001A.KARAOKE_RED_DOT_MESSAGE;
    }
}
