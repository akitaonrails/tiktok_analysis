package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import tikcast.linkmic.common.LinkerMediaChangeOperator;

/* JADX INFO: loaded from: classes.dex */
public final class LinkerMediaChangeContent {

    @C09CT("anchor_id")
    public Long anchorId;

    @C09CT("change_scene")
    public int changeScene;

    @C09CT("op")
    public int op;

    @C09CT("operator_info")
    public LinkerMediaChangeOperator operatorInfo;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("to_user_id")
    public Long toUserId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", op=");
        sb.append(this.op);
        if (this.toUserId != null) {
            sb.append(", to_user_id=");
            sb.append(this.toUserId);
        }
        if (this.anchorId != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchorId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        sb.replace(0, 2, "LinkerMediaChangeContent{");
        sb.append('}');
        return sb.toString();
    }
}
