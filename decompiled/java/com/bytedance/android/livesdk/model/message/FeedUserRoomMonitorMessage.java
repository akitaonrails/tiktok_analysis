package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class FeedUserRoomMonitorMessage extends AbstractC1136060ffY {
    public String LL;

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("room_status")
    public long roomStatus;

    @C09CT("room_time")
    public long roomTime;

    @C09CT("seq_detect_result")
    public SeqDetectResult seqDetectResult;

    @C09CT("stream_status")
    public long streamStatus;

    public FeedUserRoomMonitorMessage() {
        this.type = C001A.FEED_USER_ROOM_MONITOR_MESSAGE;
        this.LL = "";
    }
}
