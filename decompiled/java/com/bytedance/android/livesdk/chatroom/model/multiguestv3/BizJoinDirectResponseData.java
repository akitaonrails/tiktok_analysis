package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BizJoinDirectResponseData {

    @C09CT("anchor_new_fix_mic_num")
    public int fixMicNumAction;

    @C09CT("anchor_new_layout")
    public int layoutTypeAction;

    @C09CT("link_type_permission")
    public long linkTypePermission;

    @C09CT("reply_im_msg_id")
    public long replyImMsgId;

    public BizJoinDirectResponseData() {
        this(0L, 0L, 0, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizJoinDirectResponseData(replyImMsgId=");
        sbLIZ.append(this.replyImMsgId);
        sbLIZ.append(", linkTypePermission=");
        sbLIZ.append(this.linkTypePermission);
        sbLIZ.append(", layoutTypeAction=");
        sbLIZ.append(this.layoutTypeAction);
        sbLIZ.append(", fixMicNumAction=");
        sbLIZ.append(this.fixMicNumAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizJoinDirectResponseData(long j, long j2, int i, int i2) {
        this.replyImMsgId = j;
        this.linkTypePermission = j2;
        this.layoutTypeAction = i;
        this.fixMicNumAction = i2;
    }
}
