package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class InvitationSwitch {

    @C09CT("extra_base")
    public SwitchExtraBase extraBase;

    @C09CT("extra_for_open")
    public SwitchExtraForOpen extraForOpen;

    @C09CT("game_id")
    public Long gameId;

    @C09CT("game_kind")
    public int gameKind;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("message")
    public String message;

    @C09CT("play_kind")
    public Long playKind;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Long status;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        sb.append(", game_kind=");
        sb.append(this.gameKind);
        if (this.gameId != null) {
            sb.append(", game_id=");
            sb.append(this.gameId);
        }
        if (this.playKind != null) {
            sb.append(", play_kind=");
            sb.append(this.playKind);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.extraBase != null) {
            sb.append(", extra_base=");
            sb.append(this.extraBase);
        }
        if (this.extraForOpen != null) {
            sb.append(", extra_for_open=");
            sb.append(this.extraForOpen);
        }
        if (this.idStr != null) {
            sb.append(", id_str=");
            sb.append(this.idStr);
        }
        sb.replace(0, 2, "InvitationSwitch{");
        sb.append('}');
        return sb.toString();
    }
}
