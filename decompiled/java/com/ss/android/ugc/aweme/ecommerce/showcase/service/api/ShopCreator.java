package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopCreator {

    @C09CT("role")
    public final int role;

    @C09CT("show_follow_button")
    public final Boolean showFollowButton;

    @C09CT("user_info")
    public final User user;

    @C09CT("user_id")
    public final long userId;

    @C09CT("user_name")
    public final String userName;

    public ShopCreator(long j, String str, int i, User user, Boolean bool) {
        this.userId = j;
        this.userName = str;
        this.role = i;
        this.user = user;
        this.showFollowButton = bool;
    }
}
