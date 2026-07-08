package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UserInfo {

    @C09CT("avatar_thumb")
    public ImageModel anchorAvatar;

    @C09CT("nick_name")
    public String nick_name;

    @C09CT("user_id")
    public long user_id;

    public UserInfo() {
        this(0L, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return this.user_id == userInfo.user_id && Intrinsics.LJFF(this.nick_name, userInfo.nick_name) && Intrinsics.LJFF(this.anchorAvatar, userInfo.anchorAvatar);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInfo(user_id=");
        sbLIZ.append(this.user_id);
        sbLIZ.append(", nick_name=");
        sbLIZ.append(this.nick_name);
        sbLIZ.append(", anchorAvatar=");
        sbLIZ.append(this.anchorAvatar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserInfo(long j, String str, ImageModel imageModel) {
        this.user_id = j;
        this.nick_name = str;
        this.anchorAvatar = imageModel;
    }
}
