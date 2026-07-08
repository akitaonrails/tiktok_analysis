package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class VoteUser {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("user_id")
    public long userId;

    @C09CT("vote_count")
    public long voteCount;
}
