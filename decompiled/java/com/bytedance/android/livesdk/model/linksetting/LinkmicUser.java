package com.bytedance.android.livesdk.model.linksetting;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LinkmicUser {

    @C09CT("avatar_thumb")
    public ImageModel avatar;

    @C09CT("display_id")
    public String displayId;

    @C09CT("linkmic_id_str")
    public String linkMicIdStr;

    @C09CT("nick_name")
    public String nickName;

    @C09CT("room_id")
    public long roomId;

    @C09CT("room_id_str")
    public String roomIdStr;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_id_str")
    public String userIdStr;

    public LinkmicUser() {
        this(0L, 0L, "", "", "", null, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkmicUser)) {
            return false;
        }
        LinkmicUser linkmicUser = (LinkmicUser) obj;
        return this.userId == linkmicUser.userId && this.roomId == linkmicUser.roomId && Intrinsics.LJFF(this.linkMicIdStr, linkmicUser.linkMicIdStr) && Intrinsics.LJFF(this.nickName, linkmicUser.nickName) && Intrinsics.LJFF(this.displayId, linkmicUser.displayId) && Intrinsics.LJFF(this.avatar, linkmicUser.avatar) && Intrinsics.LJFF(this.userIdStr, linkmicUser.userIdStr) && Intrinsics.LJFF(this.roomIdStr, linkmicUser.roomIdStr);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkmicUser(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", linkMicIdStr=");
        sbLIZ.append(this.linkMicIdStr);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.nickName);
        sbLIZ.append(", displayId=");
        sbLIZ.append(this.displayId);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", userIdStr=");
        sbLIZ.append(this.userIdStr);
        sbLIZ.append(", roomIdStr=");
        sbLIZ.append(this.roomIdStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LinkmicUser(long j, long j2, String str, String str2, String str3, ImageModel imageModel, String str4, String str5) {
        this.userId = j;
        this.roomId = j2;
        this.linkMicIdStr = str;
        this.nickName = str2;
        this.displayId = str3;
        this.avatar = imageModel;
        this.userIdStr = str4;
        this.roomIdStr = str5;
    }
}
