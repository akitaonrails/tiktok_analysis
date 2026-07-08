package com.ss.android.ugc.aweme.newselector.repository;

import X.C09CT;
import com.ss.android.ugc.aweme.im.contacts.api.model.Avatars;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class RelatedFriendStruct implements Serializable {

    @C09CT("avatars")
    public final Avatars avatar;

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("nick_name")
    public final String nickname;

    @C09CT("user_id")
    public final String uid;

    @C09CT("unique_id")
    public final String uniqueId;

    public final User toUser$im_group_chat_release() {
        User user = new User();
        user.setUid(this.uid);
        user.setUniqueId(this.uniqueId);
        Integer num = this.followStatus;
        user.setFollowStatus(num != null ? num.intValue() : -1);
        user.setNickname(this.nickname);
        Avatars avatars = this.avatar;
        user.setAvatarMedium(avatars != null ? avatars.avatarMedium : null);
        Avatars avatars2 = this.avatar;
        user.setAvatarThumb(avatars2 != null ? avatars2.avatarThumb : null);
        return user;
    }

    public RelatedFriendStruct(String str, String str2, Integer num, String str3, Avatars avatars) {
        this.uid = str;
        this.uniqueId = str2;
        this.followStatus = num;
        this.nickname = str3;
        this.avatar = avatars;
    }
}
