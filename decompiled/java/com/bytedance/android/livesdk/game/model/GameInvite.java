package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GameInvite {

    @C09CT("create_time")
    public Long createTime;

    @C09CT("expire_time")
    public Long expireTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("kind")
    public Long kind;

    @C09CT("now_time")
    public Long nowTime;

    @C09CT("room_id")
    public Long roomId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Long status;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.kind != null) {
            sb.append(", kind=");
            sb.append(this.kind);
        }
        if (this.createTime != null) {
            sb.append(", create_time=");
            sb.append(this.createTime);
        }
        if (this.nowTime != null) {
            sb.append(", now_time=");
            sb.append(this.nowTime);
        }
        if (this.expireTime != null) {
            sb.append(", expire_time=");
            sb.append(this.expireTime);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.idStr != null) {
            sb.append(", id_str=");
            sb.append(this.idStr);
        }
        sb.replace(0, 2, "GameInvite{");
        sb.append('}');
        return sb.toString();
    }
}
