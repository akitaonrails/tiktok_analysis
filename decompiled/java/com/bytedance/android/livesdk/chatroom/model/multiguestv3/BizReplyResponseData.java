package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* JADX INFO: loaded from: classes.dex */
public final class BizReplyResponseData {

    @C09CT("anchor_new_fix_mic_num")
    public int fixMicNumAction;

    @C09CT("host_perception_info")
    public PerceptionMessage hostPerceptionInfo;

    @C09CT("anchor_new_layout")
    public int layoutTypeAction;

    @C09CT("link_type_permission")
    public long linkTypePermission;

    public BizReplyResponseData() {
        this(0L, 0, 0, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizReplyResponseData(linkTypePermission=");
        sbLIZ.append(this.linkTypePermission);
        sbLIZ.append(", layoutTypeAction=");
        sbLIZ.append(this.layoutTypeAction);
        sbLIZ.append(", fixMicNumAction=");
        sbLIZ.append(this.fixMicNumAction);
        sbLIZ.append(", hostPerceptionInfo=");
        sbLIZ.append(this.hostPerceptionInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizReplyResponseData(long j, int i, int i2, PerceptionMessage perceptionMessage) {
        this.linkTypePermission = j;
        this.layoutTypeAction = i;
        this.fixMicNumAction = i2;
        this.hostPerceptionInfo = perceptionMessage;
    }
}
