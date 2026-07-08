package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiActionUser {

    @C09CT("action_emoji")
    public final String actionEmoji;

    @C09CT("action_user")
    public final User actionUser;

    public BulletinEmojiActionUser() {
        this(null, "");
    }

    public BulletinEmojiActionUser(User user, String str) {
        this.actionUser = user;
        this.actionEmoji = str;
    }
}
