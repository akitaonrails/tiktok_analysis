package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class BattleBaseUserInfo {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("display_id")
    public String displayId;

    @C09CT("invitation_role")
    public int invitationRole;

    @C09CT("nick_name")
    public String nickName;

    @C09CT("room_id")
    public long roomId;

    @C09CT("user_id")
    public Long userId;

    public BattleBaseUserInfo() {
        this(null, null, null, null, 0L, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleBaseUserInfo(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.nickName);
        sbLIZ.append(", displayId=");
        sbLIZ.append(this.displayId);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", invitationRole=");
        sbLIZ.append(this.invitationRole);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BattleBaseUserInfo(Long l, String str, String str2, ImageModel imageModel, long j, int i) {
        this.userId = l;
        this.nickName = str;
        this.displayId = str2;
        this.avatarThumb = imageModel;
        this.roomId = j;
        this.invitationRole = i;
    }
}
