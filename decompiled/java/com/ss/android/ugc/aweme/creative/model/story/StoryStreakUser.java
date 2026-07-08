package com.ss.android.ugc.aweme.creative.model.story;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryStreakUser implements Serializable {

    @C09CT("avatar_thumb")
    public final UrlModel avatarModel;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uid")
    public final String uid;

    @C09CT("username")
    public final String username;

    public StoryStreakUser() {
        this("", "", "", "", null);
    }

    public StoryStreakUser(String str, String str2, String str3, String str4, UrlModel urlModel) {
        this.uid = str;
        this.secUid = str2;
        this.username = str3;
        this.nickname = str4;
        this.avatarModel = urlModel;
    }
}
