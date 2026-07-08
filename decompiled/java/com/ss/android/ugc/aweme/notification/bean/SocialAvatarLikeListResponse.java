package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialAvatarLikeListResponse extends BaseResponse {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("like_users")
    public final List<User> users = C13BV.INSTANCE;
}
