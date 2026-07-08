package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentDB {

    @C09CT("user_avatar")
    public final TuxImageModel avatar;

    @C09CT("comment_language")
    public final String commentLanguage;

    @C09CT("content")
    public final String content;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("user_id")
    public final String userId;

    public BulletinCommentDB(String str, String str2, String str3, TuxImageModel tuxImageModel, String str4, Integer num) {
        this.id = str;
        this.content = str2;
        this.userId = str3;
        this.avatar = tuxImageModel;
        this.commentLanguage = str4;
        this.status = num;
    }
}
