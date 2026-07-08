package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionUser {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("display_id")
    public String displayId;

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT("user_id")
    public Long userId;

    @C09CT("user_id_str")
    public String userIdStr;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.userId != null) {
            sb.append(", user_id=");
            sb.append(this.userId);
        }
        if (this.userIdStr != null) {
            sb.append(", user_id_str=");
            sb.append(this.userIdStr);
        }
        if (this.displayId != null) {
            sb.append(", display_id=");
            sb.append(this.displayId);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        sb.replace(0, 2, "CollectionUser{");
        sb.append('}');
        return sb.toString();
    }
}
