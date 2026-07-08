package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.SeqDetectResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DownlinkLiveStatusItem implements Serializable {

    @C09CT("anchor_id")
    public final long anchorId;

    @C09CT("avatar_url")
    public final List<String> avatarUrl;

    @C09CT("region")
    public final String region;

    @C09CT("room_id")
    public final long roomId;

    @C09CT("room_status")
    public final int roomStatus;

    @C09CT("room_time")
    public final long roomTime;

    @C09CT("seq_detect_result")
    public SeqDetectResult seqDetectResult;

    @C09CT("stream_status")
    public final int streamStatus;

    public DownlinkLiveStatusItem() {
        this(0L, 0L, 0L, 0, 0, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownlinkLiveStatusItem(roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.anchorId);
        sbLIZ.append(", roomTime=");
        sbLIZ.append(this.roomTime);
        sbLIZ.append(", roomStatus=");
        sbLIZ.append(this.roomStatus);
        sbLIZ.append(", streamStatus=");
        sbLIZ.append(this.streamStatus);
        sbLIZ.append(", seqDetectResult=");
        sbLIZ.append(this.seqDetectResult);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.avatarUrl);
        sbLIZ.append(", region=");
        sbLIZ.append(this.region);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setSeqDetectResult(SeqDetectResult seqDetectResult) {
        this.seqDetectResult = seqDetectResult;
    }

    public DownlinkLiveStatusItem(long j, long j2, long j3, int i, int i2, SeqDetectResult seqDetectResult, List<String> list, String str) {
        this.roomId = j;
        this.anchorId = j2;
        this.roomTime = j3;
        this.roomStatus = i;
        this.streamStatus = i2;
        this.seqDetectResult = seqDetectResult;
        this.avatarUrl = list;
        this.region = str;
    }
}
