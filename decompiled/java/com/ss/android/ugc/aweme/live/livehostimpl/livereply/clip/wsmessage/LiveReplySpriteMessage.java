package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import tikcast.api.anchor.FrameInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplySpriteMessage extends LiveReplySocketMessage {
    public static final int $stable = 8;

    @C09CT("end_time")
    public long endTime;

    @C09CT("frame_list")
    public List<FrameInfo> frameList;

    @C09CT("start_time")
    public long startTime;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveReplyClipMessagePayload(roomId=");
        sbLIZ.append(getRoomId());
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", frameList=");
        sbLIZ.append(this.frameList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final List<FrameInfo> getFrameList() {
        return this.frameList;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setFrameList(List<FrameInfo> list) {
        this.frameList = list;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
