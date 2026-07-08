package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarLikeRequest {

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT("to_avatar_id")
    public final Long avatarId;

    @C09CT("to_user_id")
    public final Long userId;

    public SocialAvatarLikeRequest(Long l, Long l2, Integer num) {
        this.avatarId = l;
        this.userId = l2;
        this.actionType = num;
    }
}
