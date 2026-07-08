package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeiNoticeboardInfo {

    @C09CT("node_id")
    public String nodeId;

    @C09CT("noticeboard_id")
    public long noticeboardId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiNoticeboardInfo)) {
            return false;
        }
        SeiNoticeboardInfo seiNoticeboardInfo = (SeiNoticeboardInfo) obj;
        return this.noticeboardId == seiNoticeboardInfo.noticeboardId && Intrinsics.LJFF(this.nodeId, seiNoticeboardInfo.nodeId) && this.status == seiNoticeboardInfo.status;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiNoticeboardInfo(noticeboardId=");
        sbLIZ.append(this.noticeboardId);
        sbLIZ.append(", nodeId=");
        sbLIZ.append(this.nodeId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeiNoticeboardInfo() {
        this(0L, "", 0);
    }

    public SeiNoticeboardInfo(long j, String str, int i) {
        this.noticeboardId = j;
        this.nodeId = str;
        this.status = i;
    }
}
