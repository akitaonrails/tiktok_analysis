package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplyClipFinishedMessage extends LiveReplySocketMessage {
    public static final int $stable = 8;

    @C09CT("fragment_id")
    public long fragmentId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveReplyClipFinishedMessage(roomId=");
        sbLIZ.append(getRoomId());
        sbLIZ.append(", fragment_id=");
        sbLIZ.append(this.fragmentId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getFragmentId() {
        return this.fragmentId;
    }

    public final void setFragmentId(long j) {
        this.fragmentId = j;
    }
}
